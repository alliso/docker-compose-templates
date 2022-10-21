import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './pages/home/home.component';
import { HttpClientModule } from "@angular/common/http";
import { TemplateComponent } from './components/template/template.component';



@NgModule({
  declarations: [
    HomeComponent,
    TemplateComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule
  ],
  exports: [
    HomeComponent
  ]
})
export class TemplateModule { }
