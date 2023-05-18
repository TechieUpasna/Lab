import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit{
x: any;
y: any;
  ngOnInit():void {}
  constructor(){}
  users=[
    {
      id:100,
      firstName:'Riya',
      lastName:'Kumari',
      emailId:'Riyakumair@gmail.com'
    },
    {
      id:101,
      firstName:'Upasana',
      lastName:'Agarwal',
      emailId:'upasana.agarwal@gmail.com'
    },
    {
      id:102,
      firstName:'Princy',
      lastName:'jain',
      emailId:'princyjain@gmail.com'
    }
  ];
}
