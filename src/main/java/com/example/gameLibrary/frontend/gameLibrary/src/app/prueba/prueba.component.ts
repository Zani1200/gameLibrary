import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-prueba',
  templateUrl: './prueba.component.html',
  styleUrls: ['./prueba.component.css']
})
export class PruebaComponent implements OnInit {

  users: any[] = []

  constructor(private http: HttpClient){
    this.http.get('http://localhost:8080').subscribe((data: any) => {
      this.users = data
      console.log(this.users)
  });
  }

  ngOnInit() {
    
  }

}
