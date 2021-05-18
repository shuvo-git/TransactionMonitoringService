package padma.tr_monitor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import padma.tr_monitor.transactions.Transaction;
import padma.tr_monitor.transactions.TransactionRepository;
import padma.tr_monitor.transactions.TransactionState;

@RestController
public class RabbitMQReceiver
{
    @Autowired
    private TransactionRepository tRepository;

    @GetMapping("getTransactions")
    public ResponseEntity<Transaction> getTransactions(){

        Transaction tmp = new Transaction(
                "TR123456",
                "5/18/2021 1:40:30 PM UTC+6",
                "172.20.30.34",
                "10500",
                "DEBIT",
                "0112100405111",
                "Jobayed Ullah",
                "01763353145",
                new TransactionState(true,false,false),
                "Successful"
        );
        tRepository.save(tmp);
        Transaction transaction = tRepository.findById("TR123456").get();

        return ResponseEntity.status(HttpStatus.OK).body(transaction);
    }

}
