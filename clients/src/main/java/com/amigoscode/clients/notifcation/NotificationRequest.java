package com.amigoscode.clients.notifcation;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}