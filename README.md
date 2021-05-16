**Project:** Innervation assignment <br />

**Technical Spec:** <br />
Java 8, Spring boot, Apache Camel, cfx <br />
Database: H2 <br />
Build tool: Maven <br />

**How to run:**  <br />
Checkout the code from github repository-> https://github.com/kaustubh23/InnervationOrder.git <br />
Open the project in eclipse as existing maven project <br />
Right click on Application.java class -> Run as -> Java Application <br />


**Endpoint: **  <br />
http://localhost:8080/soap-api/service/order

**Sample Request:** <br />

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ord="http://example.com/order.xsd">
   <soapenv:Header/>
   <soapenv:Body>
      <ord:SendOrderRequest>
         <orderNumber>123</orderNumber>
         <itemCode>123</itemCode>
         <description>kaustubh</description>
         <qty>2</qty>
         <amount>9000</amount>
      </ord:SendOrderRequest>
   </soapenv:Body>
</soapenv:Envelope>

 <br />
Sample Response: <br />

<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:SendOrderResponse xmlns:ns2="http://example.com/order.xsd">
         <responseCode>01</responseCode>
         <responseMessage>Out of stock)</responseMessage>
      </ns2:SendOrderResponse>
   </soap:Body>
</soap:Envelope>

H2 Database: <br />
http://localhost:8080/h2-console/
 <br />
Connection URL:  <br />
jdbc:h2:mem:innervation <br />
UserName: <br />
sa <br />
Password:(Not Required) <br />


Remaining Tasks: <br />
Code analysis tool implementation <br />
Negative test scenarios <br />
Containerization <br />
