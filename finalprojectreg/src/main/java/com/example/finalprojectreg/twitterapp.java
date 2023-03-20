package com.example.finalprojectreg;

import java.util.Scanner;
import java.lang.*;
import java.util.*;


public class twitterapp {
    private int maxUserId;
    private String userName;

    public twitterapp(int maxUserId, String userName) {

    }

    public twitterapp() {

    }


    public static void main(String args[]) {

        int opt_1;
            twitterapp application = new twitterapp();
            Scanner input = new Scanner(System.in);
            System.out.println("Twitter application");
            do {
                System.out.println("1. Create_User");
                System.out.println("2. Accpt_Follower");
                System.out.println("3. Post Tweet");
                System.out.println("4. Get Home Page");
                System.out.println("5. Follow a user");
                System.out.println("6. Delete a tweet");
                System.out.println("7. Get Feed for user");
                System.out.println("8. Hide a tweet");
                System.out.println("Press anything else to quit.");
                opt_1 = input.nextInt();
                 String flush = input.nextLine();
                 String str;
                 String follower;
                //String message;
                String message;
                String main;
                int tweetId;
                switch (opt_1) {
                    case 1:
                        System.out.println("Please enter the user name:");
                        str = input.nextLine();
                        application.createUser(str);
                        break;
                    case 2:
                        System.out.println("Please enter your user name:");
                        str = input.nextLine();
                        System.out.println("Please enter the user name of who you want to aceept:");
                        follower = input.nextLine();
                        application.acptrequest(str, follower);
                        break;
                    case 3:
                        System.out.println("Please enter the user name:");
                        str = input.nextLine();
                        System.out.println("Please enter your tweet:");
                        message = input.nextLine();
                        application.ptweet(str, message);
                        break;
                    case 4:
                        System.out.println("Please enter the user name:");
                        str = input.nextLine();
                        application.showHpg(str);
                        break;
                    case 5:
                        System.out.println("Please enter your user name:");
                        str = input.nextLine();
                        System.out.println("Please enter the user name of who you want to follow:");
                        main = input.nextLine();
                        application.submitreq(str, main);
                        break;
                    case 6:
                        System.out.println("Please enter the user name:");
                        str = input.nextLine();
                        System.out.println("Please enter the ID of the tweet you want to delete:");
                        tweetId = input.nextInt();
                        flush = input.nextLine();
                        application.deltweet(tweetId, str);
                        break;
                    case 7:
                        System.out.println("Get the feed:");
                                str=input.nextLine();
                        System.out.println("enter the user id:");
                        tweetId=input.nextInt();

                        application.feedtweet(tweetId,str);
                        break;

                    default:
                        System.out.println("Thank you for using! Have a good day.");
                }
            } while (opt_1 >= 1 && opt_1 <= 8);


        }

    private void feedtweet(int tweetId, String str) {
    }


    private void ptweet (String name, String message){

        }


        private void showHpg (String name){


        }

        private void deltweet ( int tweetId, String name){
        }

        private void submitreq (String name, String main){
        }

        private void acptrequest (String name, String follower){
        }

        private void createUser (String name){


            }
        }


