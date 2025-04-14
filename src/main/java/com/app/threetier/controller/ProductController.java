package com.app.threetier.controller;

import com.app.threetier.domain.ProdectVO;
import com.app.threetier.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping ("/product/*")
public class ProductController {
//    private final ProductService productService;
//
////    상품 작성 이동
//    @GetMapping("write")
//    public void goToWrite(Model model) {
//        model.addAttribute("productVO", new ProdectVO());
//    }
////    상품 작성 확인
//    @PostMapping("write")
//    public RedirectView write(ProdectVO productVO) {
//        productService.writeProduct(productVO);
//        return new RedirectView("/product/list");
//    }
////    상품 리스트 이동
//    @GetMapping("list")
//    public void goToList(Model model) {
//        model.addAttribute("productList", productService.productList());
//    }
////    상품 단일 조회
//    @GetMapping("read")
//    public void goToRead(@RequestParam("id") Long id, Model model) {
//        model.addAttribute("product", productService.selectById(id).orElseThrow(() -> {
//            throw new RuntimeException("Product id not found");
//        }));
//    }

}
