<?php
//including the database connection file
 $connect = mysqli_connect("localhost", "root", "", "test");  
 $query = "SELECT * FROM tbl_employee ORDER BY id DESC";  
 $result = mysqli_query($connect, $query); 
//getting id of the data from url
$id = $_GET['id'];
//deleting the row from table
$result = mysqli_query($connect, "DELETE FROM tbl_employee WHERE id=$id");
//redirecting to the display page (index.php in our case)
header("Location:index.php");
?>