<!DOCTYPE html>
<html>
    <head>
    </head>
    <body bgcolor="#BBCCĐD">
        <div align="center">
            <form action= "UpdatePBServlet" method="post">
                <table  border="0">
                    <caption>Thong tin phong ban</caption>
                    <tr>
                        <th>Ma phong ban &emsp;</th>
                        <th><input type= text name=ip readonly value='${p.idpb}'></th>
                    </tr>
                    <tr>
                        <th>Ten phong ban &emsp;</th>
                         <th><input type= "text" name="txttenpb" value='${p.tenpb}'></th> 
                    </tr>
                    <tr>
                        <th>Mo ta &emsp;</th>
                        <th><input type= text name=txtmota value='${p.mota}'></th>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type=submit name=b1 value="OK" >
                            <input type=reset name=r1 value="Reset">
                        </th>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>