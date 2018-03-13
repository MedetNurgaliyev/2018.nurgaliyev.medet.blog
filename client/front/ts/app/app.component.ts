import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";



@Component({
    selector:"blog_app",
    template:`<h1>{{text}}</h1>
    <div class="login-card">
        <form>
            <input type="email" name="email" placeholder="Email">
            <input type="password" name="pass" placeholder="Password">
            <input type="submit" name="login" class="login login-submit" value="login">
        </form>
        <br>
        <div class="login-help">
            <a href="#">Not registered yet ?</a>
        </div>
    </div>
    `
})
export class AppComponent implements OnInit {
    private text:string;

    ngOnInit(): void {
        this.httpService.get("/getMainText").toPromise().then(
            result =>{
                console.log(result);
                this.text=result.json();
            },
            error =>{
                this.text="Login form";

            }
        )
    }
    constructor (private httpService:HttpService){
        httpService.post
    }
}