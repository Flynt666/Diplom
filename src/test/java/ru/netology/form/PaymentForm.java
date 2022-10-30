package ru.netology.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class PaymentForm {

    String id;
    String amount;
    String created;
    String status;
    String transaction_id;

}
