# jooq-playground


## prerequisite
- intellij
- java 11
- postgresql
- pgAdmin or other postgres GUI (optional)
### setup database 
```sql
CREATE DATABASE `library`;

USE `library`;

CREATE TABLE `author` (
  `id` int NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
```


## how to run
1. build the project throught codegen plugin
2. 
   ![step_1](https://user-images.githubusercontent.com/37922672/158750658-1cf5529e-98a3-4d87-93ae-f8ecb44c3fe0.png)
   
   if build success, dir `target` would be generated
   
   ![image](https://user-images.githubusercontent.com/37922672/158752597-688d16f0-c7d4-49a6-b152-2729967119c8.png)

2. mark as generated sources root `target/generated-sources/jooq` 
   - right click on dir `jooq` 
   - mark directory as
   - click `Generated Sources Root`
   after mark jooq as `generated sources root`
   
   ![image](https://user-images.githubusercontent.com/37922672/158752666-ac89a4cc-637f-42a3-ad66-b8d659e3d880.png)


3. Run the main class
   example output : 
   ![image](https://user-images.githubusercontent.com/37922672/158751923-3b467ead-dbc0-43d7-9fb2-5d898eec0f4c.png)


## note :
1. do not forget set ** target bytecode version ** to 11 (Settings > Build, Execution, Deployment > Compiler > Java Compiler )
  ![image](https://user-images.githubusercontent.com/37922672/158752213-0112e3fb-cf6f-44cb-9e29-ae0fed8727ff.png)
2. set project sdk in project structure to using jdk 11
  ![image](https://user-images.githubusercontent.com/37922672/158752367-a86b05ff-0c1b-40f9-bcf2-c29874b425e1.png)

