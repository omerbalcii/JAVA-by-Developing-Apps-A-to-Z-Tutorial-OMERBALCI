
public class UnluHarfOdevi {
    enum UnluHarf {
        A, E, I, İ, O, Ö, U, Ü
    }

    public static void main(String[] args) {
        String Kelime = "ömer faruk balci";

        System.out.println("Orijinal Kelime: " + Kelime);

        String donusturulmusKelime = donustur(Kelime);

        System.out.println("Dönüştürülmüş Kelime: " + donusturulmusKelime);
    }

    public static String donustur(String kelime) {
        StringBuilder donusturulmusKelime = new StringBuilder();
        int i = 0;
        while (i < kelime.length()) {
            char karakter = kelime.charAt(i);
            UnluHarf unluHarf = null;
            
            switch (Character.toUpperCase(karakter)) {
                case 'A':
                    unluHarf = UnluHarf.A;
                    break;
                case 'E':
                    unluHarf = UnluHarf.E;
                    break;
                case 'I':
                    unluHarf = UnluHarf.I;
                    break;
                case 'İ':
                    unluHarf = UnluHarf.İ;
                    break;
                case 'O':
                    unluHarf = UnluHarf.O;
                    break;
                case 'Ö':
                    unluHarf = UnluHarf.Ö;
                    break;
                case 'U':
                    unluHarf = UnluHarf.U;
                    break;
                case 'Ü':
                    unluHarf = UnluHarf.Ü;
                    break;
                default:
                    donusturulmusKelime.append(karakter);
                    i++;
                    continue;
            }

            donusturulmusKelime.append(getUnluharf(unluHarf));
            i++;
        }
        return donusturulmusKelime.toString();
    }

    public static String getUnluharf(UnluHarf unluHarf) {
        switch (unluHarf) {
            case A:
                return "1";
            case E:
                return "2";
            case I:
                return "3";
            case İ:
                return "4";
            case O:
                return "5";
            case Ö:
                return "6";
            case U:
                return "7";
            case Ü:
                return "8";
            default:
                return "";
        }
    }
}
