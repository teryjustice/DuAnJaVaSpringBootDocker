package com.example.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "<!DOCTYPE html>" +
               "<html>" +
               "<head>" +
               "<meta charset='UTF-8'>" +
               "<title>Docker Deployment Success</title>" +
               "<style>" +
               "body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f4f7f6; color: #333; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }" +
               ".container { background: white; padding: 40px; border-radius: 12px; box-shadow: 0 4px 20px rgba(0,0,0,0.1); text-align: center; max-width: 500px; border-top: 8px solid #007bff; }" +
               "h1 { color: #007bff; margin-bottom: 20px; }" +
               ".info { text-align: left; background: #e9f5ff; padding: 20px; border-radius: 8px; border-left: 5px solid #007bff; }" +
               "p { margin: 10px 0; font-size: 1.1em; }" +
               "strong { color: #0056b3; }" +
               ".footer { margin-top: 30px; font-size: 0.9em; color: #777; }" +
               "</style>" +
               "</head>" +
               "<body>" +
               "<div class='container'>" +
               "<h1>🚀 Deploy Thành Công!</h1>" +
               "<div class='info'>" +
               "<p><strong>Họ Tên:</strong> Lê Anh Tuấn</p>" +
               "<p><strong>MSSV:</strong> 2280603550</p>" +
               "<p><strong>Khoa:</strong> CNTT</p>" +
               "<p><strong>Giảng viên hướng dẫn:</strong> Bùi Phú Khuyên</p>" +
               "</div>" +
               "<div class='footer'>Ứng dụng Spring Boot chạy trong Docker</div>" +
               "</div>" +
               "</body>" +
               "</html>";
    }
}
