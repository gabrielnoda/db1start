import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  numeroUm: number = 2;
  numeroDois: number = 10;
  operacao: string = 'SOMA';

  constructor(private http: HttpClient){

  }

  onClickExercutarOperacao(){
    const calculadora = {
    operacao: this.operacao,
    numeroUm: this.numeroUm,
    numeroDois: this.numeroDois
  };

  this.http.post('http://localhost:9090/api/calculadora',calculadora).subscribe(response => console.log(response));
  }
}