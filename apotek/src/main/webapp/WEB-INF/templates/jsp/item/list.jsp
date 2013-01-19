<%-- 
    Document   : list
    Created on : Jan 17, 2013, 6:58:34 PM
    Author     : cak-ust
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Item</title>
    </head>
    <body>
        <h1>Daftar Item</h1>
        <a href="form">Tambah data baru</a>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Kode</th>
                    <th>Nama</th>
                    <th>Kategori</th>
                    <th>Mulai Trx</th>
                    <th> &nbsp;</th>
                </tr>
            </thead>
            <tbody >
                <c:forEach var="i" items="${daftarItem}">
                    <tr>
                        <td>${i.kodeItem}</td>
                        <td>${i.namaItem}</td>
                        <td>${i.kategoriItem.namaKategori}</td>
                        <td>${i.tglAwalTrx}</td>
                        <td>
                            <a href="view?kode=${i.kodeItem}">lihat</a> | 
                            <a href="form?kode=${i.kodeItem}">edit</a> | 
                            <a href="delete?kode=${i.kodeItem}">hapus</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
            
        </table>
        
    </body>
    
</html>
