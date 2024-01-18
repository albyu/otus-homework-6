package ru.boldyrev.otus.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ProgressEmulatorElement {
    private LocalDateTime insertTime;
    private String orderId;
}
