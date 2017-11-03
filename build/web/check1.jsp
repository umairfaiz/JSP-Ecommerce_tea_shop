<%-- 
    Document   : check1
    Created on : Dec 14, 2016, 3:34:17 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="aa-order-summary-area">
                                            <table class="table table-responsive">
                                                <thead>
                                                    <tr>
                                                        <th>Product</th>
                                                        <th>Total (Rs.)</th>
                                                    </tr>
                                                </thead>
                                                <sql:setDataSource var="connectdb" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/DBHaleTae" user="umair" password="1234"/>
                                                <sql:query var="cartList"  dataSource="${connectdb}">
                                                    SELECT * FROM UMAIR.CARTDETAIL where USEREMAIL='${myCust.customerEmail}'
                                                </sql:query>
                                                <c:forEach items="${cartList.rows}" var="i">
                                                    
                                                    <tbody>
                                                        <tr>
                                                            <td>${i.ITEMNAME} <strong> x ${i.QTY}</strong></td>
                                                            <td>${i.TOTAL}</td>
                                                            <input type="hidden" name="subTotal" value="${i.TOTAL}">
                                                            <input type="hidden" name="itemID" value="${i.ITEMID}">
                                                            <input type="hidden" name="totQty" value="${fQty}">
                                                            <input type="hidden" name="userEmail" value="${myCust.customerEmail}">
                                                        </tr>
                                                </c:forEach> 
                                                </tbody>
                                                <tfoot>
                                                    <tr>
                                                        <th>sub-total</th>
                                                        <td>${fTotal}</td>
                                                        <input type="hidden" name="payableTotal" value="${fTotal}">
                                                    </tr>
                                                    <tr>
                                                        <th>Redeemable points*</th> 
                                                        <td>${mPoints}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Delivery/Shipping charges</th> 
                                                        <td>${deliShip}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Total</th> 
                                                        <td>${PTotal}</td>
                                                        <input type="hidden" name="finalTotal" value="${PTotal}">
                                                        <input type="hidden" name="purchNote">
                                                    </tr>
                                                </tfoot>
                                                <jsp:useBean id="nowdate" class="java.util.Date" scope="page" />
                                                <fmt:formatDate  value="${nowdate}" pattern="yyyy-MM-dd" />
                                            </table>
                                        </div>
</body>
</html>
