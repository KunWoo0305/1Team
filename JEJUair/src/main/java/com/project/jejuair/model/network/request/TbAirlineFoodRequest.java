package com.project.jejuair.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbAirlineFoodRequest {
    private Long foodIdx;
    private Integer foodKrwPrice;
    private Integer foodUsdPrice;
    private Integer foodJpyPrice;
    private String foodKorName;
    private String foodEngName;
    private Integer foodDiscount;
    private String foodPicture;
    private String foodStartingPoint;
    private String foodSpecific;
    private String foodTitle;
    private String foodContent;
    private LocalDateTime foodRegDate;

}
