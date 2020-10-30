CREATE PROCEDURE BI_Inserir_Aluno_Procedure1

@Nome VARCHAR(100),
@Telefone VARCHAR(100)

AS
BEGIN

INSERT INTO Alunos
    (Nome_aluno,Telefone_aluno)
VALUES (@Nome,@Telefone)
END

EXECUTE BI_Inserir_Aluno_Procedure1 'Bruno','(11) 94567-8765'

SELECT *FROM Alunos
