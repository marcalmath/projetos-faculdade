using ClasseRomano;
namespace ConversorTestes
{
    [TestClass]
    public class MeusTestes
    {
        [TestMethod]
        public void TesteParaRetornarInteiro()
        {
            //Arrange
            var converter = new MinhaClasse();

            //Act
            var resultado = converter.AoReceberUmCaracterRetornarInteiro('X');

            //Assert
            Assert.AreEqual(10, resultado);
        }

        [TestMethod]
        public void TesteParaSomarString()
        {
            //Arrange
            var converter = new MinhaClasse();

            //Act
            var resultado = converter.SomarCaracteres("MMDCCLXXXIX");

            //Assert
            Assert.AreEqual(2789, resultado);
        }

        [TestMethod]
        public void TesteDeValidacao()
        {
            //Arrange
            var converter = new MinhaClasse();

            //Act
            var resultado = converter.ValidarNumeroInserido("MMMCMXCIX");

            //Assert
            Assert.AreEqual(true, resultado);
        }
    }
}