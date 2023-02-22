export class User {
    userId: number = 0;
    name: string = '';
    firstName: string = '';
    email: string = '';
    password: string = '';
    subDate: Date = new Date();
    expDate: Date = new Date();
    admin: boolean = false;
    enable: boolean = false;
}