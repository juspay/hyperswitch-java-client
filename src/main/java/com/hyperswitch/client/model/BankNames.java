/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Name of banks supported by Hyperswitch
 */
public enum BankNames {
  
  AMERICAN_EXPRESS("american_express"),
  
  AFFIN_BANK("affin_bank"),
  
  AGRO_BANK("agro_bank"),
  
  ALLIANCE_BANK("alliance_bank"),
  
  AM_BANK("am_bank"),
  
  BANK_OF_AMERICA("bank_of_america"),
  
  BANK_ISLAM("bank_islam"),
  
  BANK_MUAMALAT("bank_muamalat"),
  
  BANK_RAKYAT("bank_rakyat"),
  
  BANK_SIMPANAN_NASIONAL("bank_simpanan_nasional"),
  
  BARCLAYS("barclays"),
  
  BLIK_P_S_P("blik_p_s_p"),
  
  CAPITAL_ONE("capital_one"),
  
  CHASE("chase"),
  
  CITI("citi"),
  
  CIMB_BANK("cimb_bank"),
  
  DISCOVER("discover"),
  
  NAVY_FEDERAL_CREDIT_UNION("navy_federal_credit_union"),
  
  PENTAGON_FEDERAL_CREDIT_UNION("pentagon_federal_credit_union"),
  
  SYNCHRONY_BANK("synchrony_bank"),
  
  WELLS_FARGO("wells_fargo"),
  
  ABN_AMRO("abn_amro"),
  
  ASN_BANK("asn_bank"),
  
  BUNQ("bunq"),
  
  HANDELSBANKEN("handelsbanken"),
  
  HONG_LEONG_BANK("hong_leong_bank"),
  
  HSBC_BANK("hsbc_bank"),
  
  ING("ing"),
  
  KNAB("knab"),
  
  KUWAIT_FINANCE_HOUSE("kuwait_finance_house"),
  
  MONEYOU("moneyou"),
  
  RABOBANK("rabobank"),
  
  REGIOBANK("regiobank"),
  
  REVOLUT("revolut"),
  
  SNS_BANK("sns_bank"),
  
  TRIODOS_BANK("triodos_bank"),
  
  VAN_LANSCHOT("van_lanschot"),
  
  ARZTE_UND_APOTHEKER_BANK("arzte_und_apotheker_bank"),
  
  AUSTRIAN_ANADI_BANK_AG("austrian_anadi_bank_ag"),
  
  BANK_AUSTRIA("bank_austria"),
  
  BANK99_AG("bank99_ag"),
  
  BANKHAUS_CARL_SPANGLER("bankhaus_carl_spangler"),
  
  BANKHAUS_SCHELHAMMER_UND_SCHATTERA_AG("bankhaus_schelhammer_und_schattera_ag"),
  
  BANK_MILLENNIUM("bank_millennium"),
  
  BANK_P_E_K_A_O_S_A("bank_p_e_k_a_o_s_a"),
  
  BAWAG_PSK_AG("bawag_psk_ag"),
  
  BKS_BANK_AG("bks_bank_ag"),
  
  BRULL_KALLMUS_BANK_AG("brull_kallmus_bank_ag"),
  
  BTV_VIER_LANDER_BANK("btv_vier_lander_bank"),
  
  CAPITAL_BANK_GRAWE_GRUPPE_AG("capital_bank_grawe_gruppe_ag"),
  
  CESKA_SPORITELNA("ceska_sporitelna"),
  
  DOLOMITENBANK("dolomitenbank"),
  
  EASYBANK_AG("easybank_ag"),
  
  E_PLATBY_V_U_B("e_platby_v_u_b"),
  
  ERSTE_BANK_UND_SPARKASSEN("erste_bank_und_sparkassen"),
  
  FRIESLAND_BANK("friesland_bank"),
  
  HYPO_ALPEADRIABANK_INTERNATIONAL_AG("hypo_alpeadriabank_international_ag"),
  
  HYPO_NOE_LB_FUR_NIEDEROSTERREICH_U_WIEN("hypo_noe_lb_fur_niederosterreich_u_wien"),
  
  HYPO_OBEROSTERREICH_SALZBURG_STEIERMARK("hypo_oberosterreich_salzburg_steiermark"),
  
  HYPO_TIROL_BANK_AG("hypo_tirol_bank_ag"),
  
  HYPO_VORARLBERG_BANK_AG("hypo_vorarlberg_bank_ag"),
  
  HYPO_BANK_BURGENLAND_AKTIENGESELLSCHAFT("hypo_bank_burgenland_aktiengesellschaft"),
  
  KOMERCNI_BANKA("komercni_banka"),
  
  M_BANK("m_bank"),
  
  MARCHFELDER_BANK("marchfelder_bank"),
  
  MAYBANK("maybank"),
  
  OBERBANK_AG("oberbank_ag"),
  
  OSTERREICHISCHE_ARZTE_UND_APOTHEKERBANK("osterreichische_arzte_und_apothekerbank"),
  
  OCBC_BANK("ocbc_bank"),
  
  PAY_WITH_I_N_G("pay_with_i_n_g"),
  
  PLACE_Z_I_P_K_O("place_z_i_p_k_o"),
  
  PLATNOSC_ONLINE_KARTA_PLATNICZA("platnosc_online_karta_platnicza"),
  
  POSOJILNICA_BANK_E_GEN("posojilnica_bank_e_gen"),
  
  POSTOVA_BANKA("postova_banka"),
  
  PUBLIC_BANK("public_bank"),
  
  RAIFFEISEN_BANKENGRUPPE_OSTERREICH("raiffeisen_bankengruppe_osterreich"),
  
  RHB_BANK("rhb_bank"),
  
  SCHELHAMMER_CAPITAL_BANK_AG("schelhammer_capital_bank_ag"),
  
  STANDARD_CHARTERED_BANK("standard_chartered_bank"),
  
  SCHOELLERBANK_AG("schoellerbank_ag"),
  
  SPARDA_BANK_WIEN("sparda_bank_wien"),
  
  SPORO_PAY("sporo_pay"),
  
  SANTANDER_PRZELEW24("santander_przelew24"),
  
  TATRA_PAY("tatra_pay"),
  
  VIAMO("viamo"),
  
  VOLKSBANK_GRUPPE("volksbank_gruppe"),
  
  VOLKSKREDITBANK_AG("volkskreditbank_ag"),
  
  VR_BANK_BRAUNAU("vr_bank_braunau"),
  
  UOB_BANK("uob_bank"),
  
  PAY_WITH_ALIOR_BANK("pay_with_alior_bank"),
  
  BANKI_SPOLDZIELCZE("banki_spoldzielcze"),
  
  PAY_WITH_INTELIGO("pay_with_inteligo"),
  
  B_N_P_PARIBAS_POLAND("b_n_p_paribas_poland"),
  
  BANK_NOWY_S_A("bank_nowy_s_a"),
  
  CREDIT_AGRICOLE("credit_agricole"),
  
  PAY_WITH_B_O_S("pay_with_b_o_s"),
  
  PAY_WITH_CITI_HANDLOWY("pay_with_citi_handlowy"),
  
  PAY_WITH_PLUS_BANK("pay_with_plus_bank"),
  
  TOYOTA_BANK("toyota_bank"),
  
  VELO_BANK("velo_bank"),
  
  E_TRANSFER_POCZTOWY24("e_transfer_pocztowy24"),
  
  PLUS_BANK("plus_bank"),
  
  ETRANSFER_POCZTOWY24("etransfer_pocztowy24"),
  
  BANKI_SPBDZIELCZE("banki_spbdzielcze"),
  
  BANK_NOWY_BFG_SA("bank_nowy_bfg_sa"),
  
  GETIN_BANK("getin_bank"),
  
  BLIK("blik"),
  
  NOBLE_PAY("noble_pay"),
  
  IDEA_BANK("idea_bank"),
  
  ENVELO_BANK("envelo_bank"),
  
  NEST_PRZELEW("nest_przelew"),
  
  MBANK_MTRANSFER("mbank_mtransfer"),
  
  INTELIGO("inteligo"),
  
  PBAC_Z_IPKO("pbac_z_ipko"),
  
  BNP_PARIBAS("bnp_paribas"),
  
  BANK_PEKAO_SA("bank_pekao_sa"),
  
  VOLKSWAGEN_BANK("volkswagen_bank"),
  
  ALIOR_BANK("alior_bank"),
  
  BOZ("boz"),
  
  BANGKOK_BANK("bangkok_bank"),
  
  KRUNGSRI_BANK("krungsri_bank"),
  
  KRUNG_THAI_BANK("krung_thai_bank"),
  
  THE_SIAM_COMMERCIAL_BANK("the_siam_commercial_bank"),
  
  KASIKORN_BANK("kasikorn_bank"),
  
  OPEN_BANK_SUCCESS("open_bank_success"),
  
  OPEN_BANK_FAILURE("open_bank_failure"),
  
  OPEN_BANK_CANCELLED("open_bank_cancelled"),
  
  AIB("aib"),
  
  BANK_OF_SCOTLAND("bank_of_scotland"),
  
  DANSKE_BANK("danske_bank"),
  
  FIRST_DIRECT("first_direct"),
  
  FIRST_TRUST("first_trust"),
  
  HALIFAX("halifax"),
  
  LLOYDS("lloyds"),
  
  MONZO("monzo"),
  
  NAT_WEST("nat_west"),
  
  NATIONWIDE_BANK("nationwide_bank"),
  
  ROYAL_BANK_OF_SCOTLAND("royal_bank_of_scotland"),
  
  STARLING("starling"),
  
  TSB_BANK("tsb_bank"),
  
  TESCO_BANK("tesco_bank"),
  
  ULSTER_BANK("ulster_bank");

  private String value;

  BankNames(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BankNames fromValue(String value) {
    for (BankNames b : BankNames.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
