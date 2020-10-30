CREATE PROCEDURE BI_Inserir_Funcionarios_Procedure3

@Nome VARCHAR(100)

AS
BEGIN

INSERT INTO Funcionarios (Nome)
VALUES (@Nome)
END

EXECUTE BI_Inserir_Funcionarios_Procedure3 'Carlos'

SELECT * FROM Funcionarios
