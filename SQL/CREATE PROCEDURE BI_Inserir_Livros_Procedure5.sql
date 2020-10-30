CREATE PROCEDURE BI_Inserir_Livros_Procedure5

    @Titulo VARCHAR(100),
    @Nome_categoria VARCHAR(100),
    @Nome VARCHAR(100)

    AS
    BEGIN TRAN
        INSERT INTO Livros
            (Titulo)
            VALUES(@Titulo);

        INSERT INTO Categorias
            (Nome_categoria)
            VALUES(@Nome_categoria);

        INSERT INTO Autores
            (Nome)
        VALUES(@Nome)

        COMMIT TRAN




EXEC BI_Inserir_Livros_Procedure5 'Harry Potter E A Câmara Secreta', 'Fantasia e Ficção','J. K. Rowling'

SELECT*FROM Categorias