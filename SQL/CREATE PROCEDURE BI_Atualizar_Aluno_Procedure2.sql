CREATE PROCEDURE BI_Atualizar_Aluno_Procedure2

    @Id_aluno INT ,
    @Telefone_aluno VARCHAR(100) 
AS
BEGIN
    UPDATE
        Alunos SET 
        Telefone_aluno = @Telefone_aluno 
        WHERE Id_aluno = @Id_aluno

END


EXEC BI_Atualizar_Aluno_Procedure2 6,'(21) 91234,4567'

SELECT *FROM Alunos
