CREATE PROCEDURE BI_Deletar_Funcinarios_Procedure4
    @Id_funcionario INT
    AS
    DELETE FROM
        Funcionarios
            WHERE Id_funcionario  = @Id_funcionario

EXEC BI_Deletar_Funcinarios_Procedure4 4

SELECT*FROM Funcionarios
