package fr.campus.DonjonEtDragon.characters;

import fr.campus.DonjonEtDragon.engine.Case;

public class Opponent implements Case {
    private String name;
    private int attack;
    private int health;

    public Opponent() {
    }

    public Opponent(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String setName(String newName) {
        return this.name = newName;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void interact(Character character) {

        if (getName().equals("fr.campus.DonjonEtDragon.characters.Gobelin")) {
            System.out.println("Tu viens de tomber sur une case avec un fr.campus.DonjonEtDragon.characters.Gobelin !");
            System.out.println("          .-,\n" +
                    "            / )      .' (       ___\n" +
                    "           //(.-\"\"\"-/ /\\ )   .-\"   \"-.\n" +
                    "           |.'     _`.\\// .-'         `..--.\n" +
                    "       ..--/-.   .'_` `'-'      ___    ( C\\ \\\n" +
                    "      /   /O\\    / O\\   |     .'   ```--`-|_/\n" +
                    "     /    \\_/|   \\__/   |    (\n" +
                    "    |     _\\-' _   __  /      `.\n" +
                    "    \\ ,--7  `.(_)_.| .'         `.\n" +
                    "     | C._)   `.___/' .---._      \\           __\n" +
                    "     \\    |       `. /      `-.    \\        ,'  `.\n" +
                    "      `--'          Y          \\    |       )     `-._.--.__\n" +
                    "                    |     \\         |    _.'  .--.___.-'`--.\\\n" +
                    "                    |      |        |\\  /    /              `\n" +
                    "               _    \\      |       /  `v    |\n" +
                    "          .'`-' `--._)     /::___.'     \\   /\n" +
                    "         /    .---.       /   `-.        \\ |\n" +
                    "      _.' _.-' `._ `-.   /       `.       /\n" +
                    "     /.--'        `-. `. \\         `-.__.'\n" +
                    "                     `.'_/                   ");
        } else if (getName().equals("fr.campus.DonjonEtDragon.characters.Dragon")) {
            System.out.println("Tu viens de tomber sur un énorme fr.campus.DonjonEtDragon.characters.Dragon et son chevalier !");
            System.out.println("                        /\\\n" +
                    "                        ||\n" +
                    "                        ||\n" +
                    "                        ||\n" +
                    "                        ||                                               ~-----~\n" +
                    "                        ||                                            /===--  ---~~~\n" +
                    "                        ||                   ;'                 /==~- --   -    ---~~~\n" +
                    "                        ||                (/ ('              /=----         ~~_  --(  '\n" +
                    "                        ||             ' / ;'             /=----               \\__~\n" +
                    "     '                ~==_=~          '('             ~-~~      ~~~~        ~~~--\\~'\n" +
                    "     \\\\                (c_\\_        .i.             /~--    ~~~--   -~     (     '\n" +
                    "      `\\               (}| /       / : \\           / ~~------~     ~~\\   (\n" +
                    "      \\ '               ||/ \\      |===|          /~/             ~~~ \\ \\(\n" +
                    "      ``~\\              ~~\\  )~.~_ >._.< _~-~     |`_          ~~-~     )\\\n" +
                    "       '-~                 {  /  ) \\___/ (   \\   |` ` _       ~~         '\n" +
                    "       \\ -~\\                -<__/  -   -  L~ -;   \\\\    \\ _ _/\n" +
                    "       `` ~~=\\                  {    :    }\\ ,\\    ||   _ :(\n" +
                    "        \\  ~~=\\__                \\ _/ \\_ /  )  } _//   ( `|'\n" +
                    "        ``    , ~\\--~=\\           \\     /  / _/ / '    (   '\n" +
                    "         \\`    } ~ ~~ -~=\\   _~_  / \\ / \\ )^ ( // :_  / '\n" +
                    "         |    ,          _~-'   '~~__-_  / - |/     \\ (\n" +
                    "          \\  ,_--_     _/              \\_'---', -~ .   \\\n" +
                    "           )/      /\\ / /\\   ,~,         \\__ _}     \\_  \"~_\n" +
                    "           ,      { ( _ )'} ~ - \\_    ~\\  (-:-)       \"\\   ~ \n" +
                    "                  /'' ''  )~ \\~_ ~\\   )->  \\ :|    _,       \" \n" +
                    "                 (\\  _/)''} | \\~_ ~  /~(   | :)   /          }\n" +
                    "                <``  >;,,/  )= \\~__ {{{ '  \\ =(  ,   ,       ;\n" +
                    "               {o_o }_/     |v  '~__  _    )-v|  \"  :       ,\"\n" +
                    "               {/\"\\_)       {_/'  \\~__ ~\\_ \\\\_} '  {        /~\\\n" +
                    "               ,/!          '_/    '~__ _-~ \\_' :  '      ,\"  ~ \n" +
                    "              (''`                  /,'~___~    | /     ,\"  \\ ~' \n" +
                    "             '/, )                 (-)  '~____~\";     ,\"     , }\n" +
                    "           /,')                    / \\         /  ,~-\"       '~'\n" +
                    "       (  ''/                     / ( '       /  /          '~'\n" +
                    "    ~ ~  ,, /) ,                 (/( \\)      ( -)          /~'\n" +
                    "  (  ~~ )`  ~}                   '  \\)'     _/ /           ~'\n" +
                    " { |) /`,--.(  }'                    '     (  /          /~'\n" +
                    "(` ~ ( c|~~| `}   )                        '/:\\         ,'\n" +
                    " ~ )/``) )) '|),                          (/ | \\)                 \n" +
                    "  (` (-~(( `~`'  )                        ' (/ '\n" +
                    "   `~'    )'`')                              '\n" +
                    "     ` ``");
        }
        System.out.println("Le "+ getName() +" t'attaque de " + getAttack());
        character.setHealthLevelChar(character.getHealthLevelChar() - getAttack());
        if (character.getHealthLevelChar() < 0){
            character.setHealthLevelChar(0);
        }

        System.out.println("il te reste " + character.getHealthLevelChar());

        new java.util.Scanner(System.in).nextLine();

        while (character.getHealthLevelChar() > 0) {
            int totalDamages = character.getStrengthChar() + character.offensiveEquipement.getAttackLevel();

            System.out.println("Tu attaques de " + totalDamages);
            setHealth(getHealth() - totalDamages);
            System.out.println("il reste " + getHealth() + " au " + getName());


            System.out.println(getName() + " prend la fuite ! Mais tu n'as pas dit ton dernier mot avec lui ... ");

            if (getHealth() <= 0) {
                System.out.println(getName() + " est vaincu !");
                break;
            }
        }

        if (character.getHealthLevelChar() == 0) {
            System.out.println(character.getNameChar() + " est mort !!");
        }
    }

    public String toString() {
        return "Ah, ah, ah je suis un méchant et j'ai " + attack + " points d'attaque";
    }
}
