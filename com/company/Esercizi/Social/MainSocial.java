package com.company.Esercizi.Social;

public class MainSocial {

        public static void main(String[] args) {
            PersonaSocial a = new PersonaSocial("Marco", "savarese");
            PersonaSocial b = new PersonaSocial("Francesco", "Zampirollo");
            PersonaSocial c = new PersonaSocial("Francesco", "Lasalvia");
            b.AddFriend(a);
            b.AddEnemy(c);
            b.AddFriend(a);
            b.AddEnemy(b);
            b.Contacts();
        }
    }


