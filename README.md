# JNDI-Example
An annotation based xml free SPRING MVC base with JNDI to connect to database and Angular in frontend

# JNDI setting for server

  Create a JNDI "jdbc/B0093983" on server
  
  1. Tomcat Setting
      1. Add the below entry in Tomcat context.xml
          "<Resource name="jdbc/B0093983"
              auth="Container"
              type="javax.sql.DataSource"
              username=""
              password=""
              url=""
              driverClassName="oracle.jdbc.driver.OracleDriver"
              initialSize="20"
              maxWaitMillis="15000"
              maxTotal="75"
              maxIdle="20"
              maxAge="7200000"
              testOnBorrow="true"
              validationQuery="select 1 from dual"
              />"
              
      2. Drop the Driver jar in Tomcat lib directory "jdbc/B0093983"
      
  2. Websphere/ Weblogic server configuration
      1. Go to the data sources
      2. Create a JNDI DS there with name 
