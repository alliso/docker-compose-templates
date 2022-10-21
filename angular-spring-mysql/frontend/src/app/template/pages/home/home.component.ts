import { Component, OnInit } from '@angular/core';
import { Template } from '../../interfaces/template';
import { TemplateService } from '../../services/template.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  templates: Template[] = [];

  constructor(private templateService: TemplateService) { }

  ngOnInit(): void {
    this.templateService.getTemplates().subscribe(resp => this.templates = resp)
  }

}
