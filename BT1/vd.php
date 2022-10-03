<html>
    <head>
    
    </head>
    <body>
        <?php 
            $s=1;
            for($i=1; i<=10; i++)
            {
                if(i%2==1) continue;
                else s*=i;
            }
            echo s;
        ?>
    </body>
</html>