package util;

import com.xbank.accountapi.model.db.Account;
import com.xbank.accountapi.model.rest.AccountResponse;

public class ServiceUtil {

    public static AccountResponse getResponseEntity(Account acct) {

        AccountResponse resp = new AccountResponse();

        resp.setAccountName(acct.getAccountName());
        resp.setAccountNumber(acct.getAccountNumber());
        resp.setAccountType(acct.getAccountType().getValue());
        resp.setBalanceAmount(acct.getBalanceAmount());
        resp.setBalanceDate(DateUtil.getFormattedDateString(acct.getBalanceDate()));
        resp.setCurrencyCode(acct.getCurrencyCode());
        resp.setCustomerId(acct.getCustomerId());
        return resp;
    }

    public static String maskIt(String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        int length = str.length();
        int maskLength = length - 4;

        if (length <= 4) {
            return "****";
        }

        StringBuilder sb = new StringBuilder(maskLength);

        for (int i = 0; i < maskLength; i++) {
            sb.append("*");
        }

        return sb.toString() + str.substring(maskLength, length);
    }

    public static void main(String[] args) {
        System.out.println(maskIt("abcd1234"));
        System.out.println(maskIt("1234"));
    }
}
