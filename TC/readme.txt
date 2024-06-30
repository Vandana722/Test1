Instructions to run the application

1. Server port - 8080
2. Database used - h2 database 
3. Set default username and password for DB
username=sa
password=
4. JDBC URL - jdbc:h2:mem:testdb
5. Enter the input in Postman
6. URL : http://localhost:8080/training/postdata
7. Sample input(in JSON format)
{
        "centercode":"12345yuiop12",
        "centername":"Jspiders",
        "student_capacity":"15",
        "email":"jspiders@gmail.com",
        "mobileno":"6009312375",
        "courses":["Java","Python"],
        "address":{
            "detailedaddress":"Block: 5, Jayanagar",
            "state":"Karnataka",
            "city":"Bangalore",
            "pincode":"530068"
        }
    }
8. To get the details of all Training centers use URL : http://localhost:8080/training/getdata (in postman)
9. You can also get the output in h2-console
10. URL for h2-console : http://localhost:8080/h2-console
11. JDBC URL - jdbc:h2:mem:testdb
12. You can see the tables created under jdbc:h2:mem:testdb
13. click on any table and check the output.
