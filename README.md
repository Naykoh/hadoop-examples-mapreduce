### MapReduce2 JAVA by HAMANI Nayel and PAVADE Karthikeyan

1.8.1 Districts containing trees (very easy)
1.8.2 Show all existing species (very easy)
1.8.3 Number of trees by species (easy)
1.8.4 Maximum height per specie of tree (average)
1.8.5 Sort the trees height from smallest to largest (average)
1.8.6 District containing the oldest tree (difficult)
1.8.7 District containing the most trees (very difficult)

##### 1.8.1 Districts containing trees

###

    -[nhamani@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \districtcount /user/nhamani/trees.csv /user/nhamani/districtcount
    
    20/11/10 18:48:52 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 18:48:52 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030532630, maxDate=1605635332630, sequenceNumber=5914, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 18:48:52 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030532630, maxDate=1605635332630, sequenceNumber=5914, masterKeyId=46)
    20/11/10 18:48:52 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3478
    20/11/10 18:48:53 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 18:48:53 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 18:48:53 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3478
    20/11/10 18:48:53 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030532630, maxDate=1605635332630, sequenceNumber=5914, masterKeyId=46)]
    20/11/10 18:48:54 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
    20/11/10 18:48:54 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 18:48:54 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3478
    20/11/10 18:48:54 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3478/
    20/11/10 18:48:54 INFO mapreduce.Job: Running job: job_1603290159664_3478
    20/11/10 18:49:05 INFO mapreduce.Job: Job job_1603290159664_3478 running in uber mode : false
    20/11/10 18:49:05 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 18:49:14 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 18:49:24 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 18:49:24 INFO mapreduce.Job: Job job_1603290159664_3478 completed successfully
    20/11/10 18:49:25 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=152
                    FILE: Number of bytes written=493499
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=16878
                    HDFS: Number of bytes written=95
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=2
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=20889
                    Total time spent by all reduces in occupied slots (ms)=27004
                    Total time spent by all map tasks (ms)=6963
                    Total time spent by all reduce tasks (ms)=6751
                    Total vcore-milliseconds taken by all map tasks=6963
                    Total vcore-milliseconds taken by all reduce tasks=6751
                    Total megabyte-milliseconds taken by all map tasks=10695168
                    Total megabyte-milliseconds taken by all reduce tasks=13826048
            Map-Reduce Framework
                    Map input records=98
                    Map output records=97
                    Map output bytes=665
                    Map output materialized bytes=152
                    Input split bytes=100
                    Combine input records=97
                    Combine output records=17
                    Reduce input groups=17
                    Reduce shuffle bytes=152
                    Reduce input records=17
                    Reduce output records=17
                    Spilled Records=34
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=193
                    CPU time spent (ms)=3370
                    Physical memory (bytes) snapshot=1455697920
                    Virtual memory (bytes) snapshot=7273676800
                    Total committed heap usage (bytes)=1555562496
                    Peak Map Physical memory (bytes)=1163161600
                    Peak Map Virtual memory (bytes)=3397304320
                    Peak Reduce Physical memory (bytes)=292536320
                    Peak Reduce Virtual memory (bytes)=3876372480
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=16778
            File Output Format Counters
                    Bytes Written=95
                    
##### Districts containing trees result
###            
    [nhamani@hadoop-edge01 ~]$ hdfs dfs -cat districtcount/part-r-00000
    11      -1
    12      -1
    13      -1
    14      -1
    15      -1
    16      -1
    17      -1
    18      -1
    19      -1
    20      -1
    3       -1
    4       -1
    5       -1
    6       -1
    7       -1
    8       -1
    9       -1

###
---
##### 1.8.2 Show all existing species
###

    [nhamani@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \existingspecies /user/nhamani/trees.csv /user/nhamani/existingspecies
    
    20/11/10 18:54:18 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 18:54:18 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030858502, maxDate=1605635658502, sequenceNumber=5923, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 18:54:18 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030858502, maxDate=1605635658502, sequenceNumber=5923, masterKeyId=46)
    20/11/10 18:54:18 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3484
    20/11/10 18:54:19 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 18:54:19 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 18:54:19 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3484
    20/11/10 18:54:19 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030858502, maxDate=1605635658502, sequenceNumber=5923, masterKeyId=46)]
    20/11/10 18:54:19 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
    20/11/10 18:54:19 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 18:54:20 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3484
    20/11/10 18:54:20 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3484/
    20/11/10 18:54:20 INFO mapreduce.Job: Running job: job_1603290159664_3484
    20/11/10 18:54:30 INFO mapreduce.Job: Job job_1603290159664_3484 running in uber mode : false
    20/11/10 18:54:30 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 18:54:39 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 18:54:49 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 18:54:49 INFO mapreduce.Job: Job job_1603290159664_3484 completed successfully
    20/11/10 18:54:50 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=727
                    FILE: Number of bytes written=494669
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=16878
                    HDFS: Number of bytes written=586
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=2
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=20700
                    Total time spent by all reduces in occupied slots (ms)=28208
                    Total time spent by all map tasks (ms)=6900
                    Total time spent by all reduce tasks (ms)=7052
                    Total vcore-milliseconds taken by all map tasks=6900
                    Total vcore-milliseconds taken by all reduce tasks=7052
                    Total megabyte-milliseconds taken by all map tasks=10598400
                    Total megabyte-milliseconds taken by all reduce tasks=14442496
            Map-Reduce Framework
                    Map input records=98
                    Map output records=97
                    Map output bytes=1383
                    Map output materialized bytes=727
                    Input split bytes=100
                    Combine input records=97
                    Combine output records=45
                    Reduce input groups=45
                    Reduce shuffle bytes=727
                    Reduce input records=45
                    Reduce output records=45
                    Spilled Records=90
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=181
                    CPU time spent (ms)=3030
                    Physical memory (bytes) snapshot=1454764032
                    Virtual memory (bytes) snapshot=7271657472
                    Total committed heap usage (bytes)=1555562496
                    Peak Map Physical memory (bytes)=1156497408
                    Peak Map Virtual memory (bytes)=3394093056
                    Peak Reduce Physical memory (bytes)=298266624
                    Peak Reduce Virtual memory (bytes)=3877564416
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=16778
            File Output Format Counters
                    Bytes Written=586

                

#####  1.8.2 Show all existing species result
###
    [nhamani@hadoop-edge01 ~]$ hdfs dfs -cat existingspecies/part-r-00000  
    
    araucana        -1
    atlantica       -1
    australis       -1
    baccata -1
    bignonioides    -1
    biloba  -1
    bungeana        -1
    cappadocicum    -1
    carpinifolia    -1
    colurna -1
    coulteri        -1
    decurrens       -1
    dioicus -1
    distichum       -1
    excelsior       -1
    fraxinifolia    -1
    giganteum       -1
    giraldii        -1
    glutinosa       -1
    grandiflora     -1
    hippocastanum   -1
    ilex    -1
    involucrata     -1
    japonicum       -1
    kaki    -1
    libanii -1
    monspessulanum  -1
    nigra   -1
    nigra laricio   -1
    opalus  -1
    orientalis      -1
    papyrifera      -1
    petraea -1
    pomifera        -1
    pseudoacacia    -1
    sempervirens    -1
    serrata -1
    stenoptera      -1
    suber   -1
    sylvatica       -1
    tomentosa       -1
    tulipifera      -1
    ulmoides        -1
    virginiana      -1
    x acerifolia    -1



###
---
##### 1.8.3 Number of trees by species
###

    [nhamani@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \treesbyspecies /user/nhamani/trees.csv /user/nhamani/treesbyspecies

    20/11/10 18:58:27 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 18:58:27 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031107850, maxDate=1605635907850, sequenceNumber=5935, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 18:58:27 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031107850, maxDate=1605635907850, sequenceNumber=5935, masterKeyId=46)
    20/11/10 18:58:28 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3492
    20/11/10 18:58:28 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 18:58:28 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 18:58:29 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3492
    20/11/10 18:58:29 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031107850, maxDate=1605635907850, sequenceNumber=5935, masterKeyId=46)]
    20/11/10 18:58:29 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
    20/11/10 18:58:29 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 18:58:29 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3492
    20/11/10 18:58:29 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3492/
    20/11/10 18:58:29 INFO mapreduce.Job: Running job: job_1603290159664_3492
    20/11/10 18:58:40 INFO mapreduce.Job: Job job_1603290159664_3492 running in uber mode : false
    20/11/10 18:58:40 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 18:58:50 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 18:59:00 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 18:59:00 INFO mapreduce.Job: Job job_1603290159664_3492 completed successfully
    20/11/10 18:59:00 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=727
                    FILE: Number of bytes written=494659
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=16878
                    HDFS: Number of bytes written=542
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=3
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=21696
                    Total time spent by all reduces in occupied slots (ms)=27664
                    Total time spent by all map tasks (ms)=7232
                    Total time spent by all reduce tasks (ms)=6916
                    Total vcore-milliseconds taken by all map tasks=7232
                    Total vcore-milliseconds taken by all reduce tasks=6916
                    Total megabyte-milliseconds taken by all map tasks=11108352
                    Total megabyte-milliseconds taken by all reduce tasks=14163968
            Map-Reduce Framework
                    Map input records=98
                    Map output records=97
                    Map output bytes=1383
                    Map output materialized bytes=727
                    Input split bytes=100
                    Combine input records=97
                    Combine output records=45
                    Reduce input groups=45
                    Reduce shuffle bytes=727
                    Reduce input records=45
                    Reduce output records=45
                    Spilled Records=90
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=203
                    CPU time spent (ms)=3820
                    Physical memory (bytes) snapshot=1450872832
                    Virtual memory (bytes) snapshot=7267336192
                    Total committed heap usage (bytes)=1567621120
                    Peak Map Physical memory (bytes)=1157533696
                    Peak Map Virtual memory (bytes)=3393576960
                    Peak Reduce Physical memory (bytes)=293339136
                    Peak Reduce Virtual memory (bytes)=3873759232
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=16778
            File Output Format Counters
                    Bytes Written=542

                

#####  1.8.3 Number of trees by species result
###
    [nhamani@hadoop-edge01 ~]$ hdfs dfs -cat treesbyspecies/part-r-00000  
    
     araucana        1
    atlantica       2
    australis       1
    baccata 2
    bignonioides    1
    biloba  5
    bungeana        1
    cappadocicum    1
    carpinifolia    4
    colurna 3
    coulteri        1
    decurrens       1
    dioicus 1
    distichum       3
    excelsior       1
    fraxinifolia    2
    giganteum       5
    giraldii        1
    glutinosa       1
    grandiflora     1
    hippocastanum   3
    ilex    1
    involucrata     1
    japonicum       1
    kaki    2
    libanii 2
    monspessulanum  1
    nigra   3
    nigra laricio   1
    opalus  1
    orientalis      8
    papyrifera      1
    petraea 2
    pomifera        1
    pseudoacacia    1
    sempervirens    1
    serrata 1
    stenoptera      1
    suber   1
    sylvatica       8
    tomentosa       2
    tulipifera      2
    ulmoides        1
    virginiana      2
    x acerifolia    11


###
---
##### 1.8.4 Maximum height per specie of tree
###

    [nhamani@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \heightperspecie /user/nhamani/trees.csv /user/nhamani/heightperspecie

    20/11/10 19:02:16 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 19:02:16 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031336669, maxDate=1605636136669, sequenceNumber=5946, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 19:02:16 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031336669, maxDate=1605636136669, sequenceNumber=5946, masterKeyId=46)
    20/11/10 19:02:16 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3500
    20/11/10 19:02:17 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 19:02:17 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 19:02:17 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3500
    20/11/10 19:02:17 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031336669, maxDate=1605636136669, sequenceNumber=5946, masterKeyId=46)]
    20/11/10 19:02:18 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
    20/11/10 19:02:18 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 19:02:18 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3500
    20/11/10 19:02:18 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3500/
    20/11/10 19:02:18 INFO mapreduce.Job: Running job: job_1603290159664_3500
    20/11/10 19:02:28 INFO mapreduce.Job: Job job_1603290159664_3500 running in uber mode : false
    20/11/10 19:02:28 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 19:02:38 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 19:02:48 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 19:02:49 INFO mapreduce.Job: Job job_1603290159664_3500 completed successfully
    20/11/10 19:02:49 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=727
                    FILE: Number of bytes written=494669
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=16878
                    HDFS: Number of bytes written=585
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=2
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=20691
                    Total time spent by all reduces in occupied slots (ms)=29152
                    Total time spent by all map tasks (ms)=6897
                    Total time spent by all reduce tasks (ms)=7288
                    Total vcore-milliseconds taken by all map tasks=6897
                    Total vcore-milliseconds taken by all reduce tasks=7288
                    Total megabyte-milliseconds taken by all map tasks=10593792
                    Total megabyte-milliseconds taken by all reduce tasks=14925824
            Map-Reduce Framework
                    Map input records=98
                    Map output records=96
                    Map output bytes=1369
                    Map output materialized bytes=727
                    Input split bytes=100
                    Combine input records=96
                    Combine output records=45
                    Reduce input groups=45
                    Reduce shuffle bytes=727
                    Reduce input records=45
                    Reduce output records=45
                    Spilled Records=90
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=209
                    CPU time spent (ms)=3380
                    Physical memory (bytes) snapshot=1462624256
                    Virtual memory (bytes) snapshot=7277232128
                    Total committed heap usage (bytes)=1559756800
                    Peak Map Physical memory (bytes)=1163362304
                    Peak Map Virtual memory (bytes)=3396493312
                    Peak Reduce Physical memory (bytes)=299261952
                    Peak Reduce Virtual memory (bytes)=3880738816
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=16778
            File Output Format Counters
                    Bytes Written=585

                
#####  1.8.4 Maximum height per specie of tree result
###

    [nhamani@hadoop-edge01 ~]$ hdfs dfs -cat heightperspecie/part-r-00000 
    
    araucana        9
    atlantica       25
    australis       16
    baccata 13
    bignonioides    15
    biloba  33
    bungeana        10
    cappadocicum    16
    carpinifolia    30
    colurna 20
    coulteri        14
    decurrens       20
    dioicus 10
    distichum       35
    excelsior       30
    fraxinifolia    27
    giganteum       35
    giraldii        35
    glutinosa       16
    grandiflora     12
    hippocastanum   30
    ilex    15
    involucrata     12
    japonicum       10
    kaki    14
    libanii 30
    monspessulanum  12
    nigra   30
    nigra laricio   30
    opalus  15
    orientalis      34
    papyrifera      12
    petraea 31
    pomifera        13
    pseudoacacia    11
    sempervirens    30
    serrata 18
    stenoptera      30
    suber   10
    sylvatica       30
    tomentosa       20
    tulipifera      35
    ulmoides        12
    virginiana      14
    x acerifolia    45


###
---
##### 1.8.5 Sort the trees height from smallest to largest
###

    [nhamani@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \treesorted /user/nhamani/trees.csv /user/nhamani/treesorted

    20/11/10 19:05:37 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 19:05:37 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031537839, maxDate=1605636337839, sequenceNumber=5961, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 19:05:37 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031537839, maxDate=1605636337839, sequenceNumber=5961, masterKeyId=46)
    20/11/10 19:05:38 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3511
    20/11/10 19:05:38 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 19:05:38 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 19:05:38 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3511
    20/11/10 19:05:38 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031537839, maxDate=1605636337839, sequenceNumber=5961, masterKeyId=46)]
    20/11/10 19:05:39 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
    20/11/10 19:05:39 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 19:05:39 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3511
    20/11/10 19:05:39 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3511/
    20/11/10 19:05:39 INFO mapreduce.Job: Running job: job_1603290159664_3511
    20/11/10 19:05:51 INFO mapreduce.Job: Job job_1603290159664_3511 running in uber mode : false
    20/11/10 19:05:51 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 19:06:00 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 19:06:05 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 19:06:06 INFO mapreduce.Job: Job job_1603290159664_3511 completed successfully
    20/11/10 19:06:06 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=1567
                    FILE: Number of bytes written=496299
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=16878
                    HDFS: Number of bytes written=1269
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=2
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=21114
                    Total time spent by all reduces in occupied slots (ms)=12040
                    Total time spent by all map tasks (ms)=7038
                    Total time spent by all reduce tasks (ms)=3010
                    Total vcore-milliseconds taken by all map tasks=7038
                    Total vcore-milliseconds taken by all reduce tasks=3010
                    Total megabyte-milliseconds taken by all map tasks=10810368
                    Total megabyte-milliseconds taken by all reduce tasks=6164480
            Map-Reduce Framework
                    Map input records=98
                    Map output records=96
                    Map output bytes=1369
                    Map output materialized bytes=1567
                    Input split bytes=100
                    Combine input records=96
                    Combine output records=96
                    Reduce input groups=28
                    Reduce shuffle bytes=1567
                    Reduce input records=96
                    Reduce output records=96
                    Spilled Records=192
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=216
                    CPU time spent (ms)=3870
                    Physical memory (bytes) snapshot=1451110400
                    Virtual memory (bytes) snapshot=7267696640
                    Total committed heap usage (bytes)=1555562496
                    Peak Map Physical memory (bytes)=1153933312
                    Peak Map Virtual memory (bytes)=3392036864
                    Peak Reduce Physical memory (bytes)=297177088
                    Peak Reduce Virtual memory (bytes)=3875659776
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=16778
            File Output Format Counters
                    Bytes Written=1269

                    
#####  1.8.5 Sort the trees height from smallest to largest result
###                    
    [nhamani@hadoop-edge01 ~]$ hdfs dfs -cat treesorted/part-r-00000  
    
    2       sylvatica
    5       baccata
    6       atlantica
    9       araucana
    10      japonicum
    10      suber
    10      bungeana
    10      dioicus
    10      sylvatica
    11      pseudoacacia
    12      virginiana
    12      grandiflora
    12      carpinifolia
    12      ulmoides
    12      monspessulanum
    12      kaki
    12      papyrifera
    12      involucrata
    13      baccata
    13      pomifera
    14      kaki
    14      coulteri
    14      virginiana
    15      opalus
    15      bignonioides
    15      sylvatica
    15      carpinifolia
    15      ilex
    16      glutinosa
    16      cappadocicum
    16      carpinifolia
    16      australis
    18      biloba
    18      serrata
    18      hippocastanum
    18      sylvatica
    20      colurna
    20      x acerifolia
    20      tomentosa
    20      colurna
    20      decurrens
    20      colurna
    20      orientalis
    20      sylvatica
    20      tomentosa
    20      giganteum
    20      distichum
    20      orientalis
    22      biloba
    22      hippocastanum
    22      orientalis
    22      fraxinifolia
    22      tulipifera
    23      sylvatica
    25      atlantica
    25      biloba
    25      x acerifolia
    25      orientalis
    25      nigra
    25      biloba
    26      orientalis
    27      fraxinifolia
    27      orientalis
    28      nigra
    30      nigra laricio
    30      petraea
    30      giganteum
    30      stenoptera
    30      carpinifolia
    30      sempervirens
    30      sylvatica
    30      x acerifolia
    30      distichum
    30      x acerifolia
    30      nigra
    30      sylvatica
    30      giganteum
    30      excelsior
    30      libanii
    30      libanii
    30      hippocastanum
    31      petraea
    31      orientalis
    32      x acerifolia
    33      biloba
    34      orientalis
    35      distichum
    35      tulipifera
    35      x acerifolia
    35      giraldii
    35      giganteum
    40      x acerifolia
    40      x acerifolia
    40      x acerifolia
    42      x acerifolia
    45      x acerifolia


###
---
##### 1.8.6 District containing the oldest tree
###
    [nhamani@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \oldesttree /user/nhamani/trees.csv /user/nhamani/oldesttree

    20/11/10 19:09:29 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 19:09:29 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031769847, maxDate=1605636569847, sequenceNumber=5971, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 19:09:29 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031769847, maxDate=1605636569847, sequenceNumber=5971, masterKeyId=46)
    20/11/10 19:09:29 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3518
    20/11/10 19:09:30 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 19:09:30 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 19:09:31 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3518
    20/11/10 19:09:31 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031769847, maxDate=1605636569847, sequenceNumber=5971, masterKeyId=46)]
    20/11/10 19:09:31 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
    20/11/10 19:09:31 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 19:09:31 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3518
    20/11/10 19:09:31 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3518/
    20/11/10 19:09:31 INFO mapreduce.Job: Running job: job_1603290159664_3518
    20/11/10 19:09:41 INFO mapreduce.Job: Job job_1603290159664_3518 running in uber mode : false
    20/11/10 19:09:41 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 19:09:51 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 19:10:02 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 19:10:02 INFO mapreduce.Job: Job job_1603290159664_3518 completed successfully
    20/11/10 19:10:02 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=50
                    FILE: Number of bytes written=493265
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=16878
                    HDFS: Number of bytes written=41
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=2
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=20949
                    Total time spent by all reduces in occupied slots (ms)=29372
                    Total time spent by all map tasks (ms)=6983
                    Total time spent by all reduce tasks (ms)=7343
                    Total vcore-milliseconds taken by all map tasks=6983
                    Total vcore-milliseconds taken by all reduce tasks=7343
                    Total megabyte-milliseconds taken by all map tasks=10725888
                    Total megabyte-milliseconds taken by all reduce tasks=15038464
            Map-Reduce Framework
                    Map input records=98
                    Map output records=77
                    Map output bytes=1001
                    Map output materialized bytes=50
                    Input split bytes=100
                    Combine input records=77
                    Combine output records=1
                    Reduce input groups=1
                    Reduce shuffle bytes=50
                    Reduce input records=1
                    Reduce output records=1
                    Spilled Records=2
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=219
                    CPU time spent (ms)=3600
                    Physical memory (bytes) snapshot=1451364352
                    Virtual memory (bytes) snapshot=7266095104
                    Total committed heap usage (bytes)=1546125312
                    Peak Map Physical memory (bytes)=1159200768
                    Peak Map Virtual memory (bytes)=3392667648
                    Peak Reduce Physical memory (bytes)=292163584
                    Peak Reduce Virtual memory (bytes)=3873427456
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=16778
            File Output Format Counters
                    Bytes Written=41


#####  1.8.6 District containing the oldest tree result
###
###
    [nhamani@hadoop-edge01 ~]$ hdfs dfs -cat oldesttree/part-r-00000    
    
    District containing oldest tree :       5 1601

###
---
##### 1.8.7 District containing the most trees
###

    [nhamani@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \mosttrees /user/nhamani/trees.csv /user/nhamani/mosttrees
   
    20/11/10 19:12:24 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 19:12:24 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031944627, maxDate=1605636744627, sequenceNumber=5980, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 19:12:24 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031944627, maxDate=1605636744627, sequenceNumber=5980, masterKeyId=46)
    20/11/10 19:12:24 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3524
    20/11/10 19:12:25 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 19:12:25 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 19:12:25 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3524
    20/11/10 19:12:25 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031944627, maxDate=1605636744627, sequenceNumber=5980, masterKeyId=46)]
    20/11/10 19:12:25 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
    20/11/10 19:12:26 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 19:12:26 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3524
    20/11/10 19:12:26 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3524/
    20/11/10 19:12:26 INFO mapreduce.Job: Running job: job_1603290159664_3524
    20/11/10 19:12:36 INFO mapreduce.Job: Job job_1603290159664_3524 running in uber mode : false
    20/11/10 19:12:36 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 19:12:46 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 19:12:55 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 19:12:55 INFO mapreduce.Job: Job job_1603290159664_3524 completed successfully
    20/11/10 19:12:55 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=865
                    FILE: Number of bytes written=495291
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=16878
                    HDFS: Number of bytes written=80
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=2
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=22878
                    Total time spent by all reduces in occupied slots (ms)=28428
                    Total time spent by all map tasks (ms)=7626
                    Total time spent by all reduce tasks (ms)=7107
                    Total vcore-milliseconds taken by all map tasks=7626
                    Total vcore-milliseconds taken by all reduce tasks=7107
                    Total megabyte-milliseconds taken by all map tasks=11713536
                    Total megabyte-milliseconds taken by all reduce tasks=14555136
            Map-Reduce Framework
                    Map input records=98
                    Map output records=97
                    Map output bytes=665
                    Map output materialized bytes=865
                    Input split bytes=100
                    Combine input records=0
                    Combine output records=0
                    Reduce input groups=17
                    Reduce shuffle bytes=865
                    Reduce input records=97
                    Reduce output records=17
                    Spilled Records=194
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=164
                    CPU time spent (ms)=3420
                    Physical memory (bytes) snapshot=1449996288
                    Virtual memory (bytes) snapshot=7268859904
                    Total committed heap usage (bytes)=1561329664
                    Peak Map Physical memory (bytes)=1155993600
                    Peak Map Virtual memory (bytes)=3393966080
                    Peak Reduce Physical memory (bytes)=294002688
                    Peak Reduce Virtual memory (bytes)=3874893824
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=16778
            File Output Format Counters
                    Bytes Written=80
    20/11/10 19:12:55 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
    20/11/10 19:12:56 INFO hdfs.DFSClient: Created token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031976006, maxDate=1605636776006, sequenceNumber=5984, masterKeyId=46 on ha-hdfs:efrei
    20/11/10 19:12:56 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031976006, maxDate=1605636776006, sequenceNumber=5984, masterKeyId=46)
    20/11/10 19:12:56 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.
    20/11/10 19:12:56 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/nhamani/.staging/job_1603290159664_3527
    20/11/10 19:12:56 INFO input.FileInputFormat: Total input files to process : 1
    20/11/10 19:12:56 INFO mapreduce.JobSubmitter: number of splits:1
    20/11/10 19:12:56 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3527
    20/11/10 19:12:56 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for nhamani: HDFS_DELEGATION_TOKEN owner=nhamani@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031976006, maxDate=1605636776006, sequenceNumber=5984, masterKeyId=46)]
    20/11/10 19:12:56 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
    20/11/10 19:12:57 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3527
    20/11/10 19:12:57 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3527/
    20/11/10 19:12:57 INFO mapreduce.Job: Running job: job_1603290159664_3527
    20/11/10 19:13:08 INFO mapreduce.Job: Job job_1603290159664_3527 running in uber mode : false
    20/11/10 19:13:08 INFO mapreduce.Job:  map 0% reduce 0%
    20/11/10 19:13:17 INFO mapreduce.Job:  map 100% reduce 0%
    20/11/10 19:13:23 INFO mapreduce.Job:  map 100% reduce 100%
    20/11/10 19:13:23 INFO mapreduce.Job: Job job_1603290159664_3527 completed successfully
    20/11/10 19:13:23 INFO mapreduce.Job: Counters: 53
            File System Counters
                    FILE: Number of bytes read=244
                    FILE: Number of bytes written=493707
                    FILE: Number of read operations=0
                    FILE: Number of large read operations=0
                    FILE: Number of write operations=0
                    HDFS: Number of bytes read=188
                    HDFS: Number of bytes written=40
                    HDFS: Number of read operations=8
                    HDFS: Number of large read operations=0
                    HDFS: Number of write operations=2
            Job Counters
                    Launched map tasks=1
                    Launched reduce tasks=1
                    Data-local map tasks=1
                    Total time spent by all maps in occupied slots (ms)=21861
                    Total time spent by all reduces in occupied slots (ms)=12388
                    Total time spent by all map tasks (ms)=7287
                    Total time spent by all reduce tasks (ms)=3097
                    Total vcore-milliseconds taken by all map tasks=7287
                    Total vcore-milliseconds taken by all reduce tasks=3097
                    Total megabyte-milliseconds taken by all map tasks=11192832
                    Total megabyte-milliseconds taken by all reduce tasks=6342656
            Map-Reduce Framework
                    Map input records=17
                    Map output records=17
                    Map output bytes=204
                    Map output materialized bytes=244
                    Input split bytes=108
                    Combine input records=0
                    Combine output records=0
                    Reduce input groups=1
                    Reduce shuffle bytes=244
                    Reduce input records=17
                    Reduce output records=1
                    Spilled Records=34
                    Shuffled Maps =1
                    Failed Shuffles=0
                    Merged Map outputs=1
                    GC time elapsed (ms)=189
                    CPU time spent (ms)=3360
                    Physical memory (bytes) snapshot=1451982848
                    Virtual memory (bytes) snapshot=7266631680
                    Total committed heap usage (bytes)=1560281088
                    Peak Map Physical memory (bytes)=1158754304
                    Peak Map Virtual memory (bytes)=3393257472
                    Peak Reduce Physical memory (bytes)=293228544
                    Peak Reduce Virtual memory (bytes)=3873374208
            Shuffle Errors
                    BAD_ID=0
                    CONNECTION=0
                    IO_ERROR=0
                    WRONG_LENGTH=0
                    WRONG_MAP=0
                    WRONG_REDUCE=0
            File Input Format Counters
                    Bytes Read=80
            File Output Format Counters
                    Bytes Written=40

                    
#####  1.8.7 District containing the most trees result
###
###

    [nhamani@hadoop-edge01 ~]$ hdfs dfs -cat mosttrees/part-r-00000 
    
    district containing the most trees:     16
