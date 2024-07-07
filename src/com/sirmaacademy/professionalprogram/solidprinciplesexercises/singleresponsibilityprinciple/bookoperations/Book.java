package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.bookoperations;

import java.math.BigDecimal;
import java.time.Year;

public class Book {

        private String title;
        private String[] authors;
        private String subtitle;
        private String publishingHouse;
        private String description;
        private BigDecimal price;
        private int quantity;
        private String language;
        private int pages;
        private Year publishingYear;

        public Book(String title, String[] authors, String publishingHouse, String language,
                    int pages, Year publishingYear, BigDecimal price) {

                setTitle(title);
                setAuthors(authors);
                this.publishingHouse = publishingHouse;
                setLanguage(language);
                setPages(pages);
                setPublishingYear(publishingYear);
                this.price = price;
                this.subtitle = null;
                this.quantity = 0;
                this.description = null;

        }

        public Book(String title, String[] authors, String subtitle, String publishingHouse,
                    String description, BigDecimal price, int quantity, String language,
                    int pages, Year publishingYear) {

                setTitle(title);
                setAuthors(authors);
                this.subtitle = subtitle;
                this.publishingHouse = publishingHouse;
                this.description = description;
                this.price = price;
                this.quantity = quantity;
                setLanguage(language);
                setPages(pages);
                setPublishingYear(publishingYear);
        }

        public String getTitle() {
                return title;
        }

        private void setTitle(String title) {
                this.title = title;
        }

        public String[] getAuthors() {
                return authors;
        }

        private void setAuthors(String[] authors) {
                this.authors = authors;
        }

        public String getSubtitle() {
                return subtitle;
        }

        public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
        }

        public String getPublishingHouse() {
                return publishingHouse;
        }

        public void setPublishingHouse(String publishingHouse) {
                this.publishingHouse = publishingHouse;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public String getLanguage() {
                return language;
        }

        private void setLanguage(String language) {
                this.language = language;
        }

        public int getPages() {
                return pages;
        }

        private void setPages(int pages) {
                this.pages = pages;
        }

        public Year getPublishingYear() {
                return publishingYear;
        }

        private void setPublishingYear(Year publishingYear) {
                this.publishingYear = publishingYear;
        }

}
