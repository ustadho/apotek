<%-- 
    Document   : form
    Created on : Jan 18, 2013, 5:43:31 AM
    Author     : cak-ust
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entri Peserta</title>
    </head>
    <body>
        <h1>Entry Peserta</h1>
        <spring:form modelAttribute="item">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Kode</td>
                        <td><spring:input path="kodeItem" /></td>
                        <td><spring:errors path="kodeItem"/></td>
                    </tr>
                    <tr>
                        <td>Nama Item</td>
                        <td><spring:input path="namaItem"/></td>
                        <td><spring:errors path="namaItem"/></td>
                    </tr>
                    <tr>
                        <td>Kategori</td>
                        <td>
                            <spring:select path="kategoriItem" >
                                <spring:option value="" label="--Pilih Kategori--" />
                                <spring:options items="${daftarKategori}" itemValue="id" itemLabel="namaKategori"/>
                            </spring:select>
                        </td>
                        <td><spring:errors path="kategoriItem"/></td>
                    </tr>
                    <tr>
                        <td>Tgl Awal Trx</td>
                        <td><spring:input path="tglAwalTrx"/></td>
                        <td><spring:errors path="tglAwalTrx"/></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value="Simpan"></td>
                        
                    </tr>
                </tbody>
            </table>

        </spring:form>
    </body>
</html>
