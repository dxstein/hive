
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.enforce.bucketing=true;
set hive.exec.reducers.max=4;
set hive.input.format=org.apache.hadoop.hive.ql.io.CombineHiveInputFormat;
set hive.default.fileformat=RCFILE;

-- EXCLUDE_HADOOP_MAJOR_VERSIONS(0.17, 0.18, 0.19)

create table srcpartbucket (key string, value string) partitioned by (ds string, hr string) clustered by (key) into 4 buckets;

insert overwrite table srcpartbucket partition(ds, hr) select * from srcpart where ds is not null and key < 10;

explain extended
select ds, count(1) from srcpartbucket tablesample (bucket 1 out of 4 on key) where ds is not null group by ds;

select ds, count(1) from srcpartbucket tablesample (bucket 1 out of 4 on key) where ds is not null group by ds;

select ds, count(1) from srcpartbucket tablesample (bucket 1 out of 2 on key) where ds is not null group by ds;

select * from srcpartbucket where ds is not null;

drop table srcpartbucket;
