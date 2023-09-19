namespace ClasseRomano
{
    public class MinhaClasse
    {
        public int AoReceberUmCaracterRetornarInteiro(char numRomano)
        {
            switch (numRomano)
            {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
            }
            return 0;
        }

        public int SomarCaracteres(string romano)
        {
            int aux = 0;
            //falta consertar a soma, ta dando pau no final dos numeros e nao somando o ultimo
            for(int i = 0; i < romano.Length-1; i++)
            {
                int valor1 = AoReceberUmCaracterRetornarInteiro(romano[i]);
                int valor2 = AoReceberUmCaracterRetornarInteiro(romano[i+1]);
                if (valor1 < valor2)
                {
                    aux += valor2 - valor1;
                    i++;
                }
                else
                {
                    aux += valor1;
                }
            }

            return aux;
        }

        public bool ValidarNumeroInserido(string romano)
        {
            int cont = 1;

            for (int i = 0; i < romano.Length-1; i++)
            {   
                
                if (romano[i] == romano[i + 1])
                {
                    cont++;
                    if(cont > 3)
                    {
                        return false;
                    }
                }
                else
                {
                    cont = 1;
                }

            }

            return true;
        }
    }

}