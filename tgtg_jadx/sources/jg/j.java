package jg;

import android.content.Context;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.AddressFieldSpec;
import com.app.tgtg.model.remote.ServerKeyboardTypes;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.user.response.AddressField;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.text.CharsKt;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f25190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ItemType f25191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f25192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f25194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f25195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f25196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f25197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f25198k;
    public final LinkedHashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f25199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f25200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f25201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f25202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f25203q;

    public j(c cVar, LinkedHashMap linkedHashMap, Context context, ItemType itemType) {
        Boolean required;
        Integer maxLength;
        String regex;
        Boolean required2;
        Integer maxLength2;
        AddressFieldSpec addressFieldSpec;
        String regex2;
        AddressFieldSpec addressFieldSpec2;
        AddressFieldSpec addressFieldSpec3;
        AddressFieldSpec addressFieldSpec4;
        AddressFieldSpec addressFieldSpec5;
        AddressFieldSpec addressFieldSpec6;
        AddressFieldSpec addressFieldSpec7;
        AddressFieldSpec addressFieldSpec8;
        cVar.getClass();
        context.getClass();
        this.f25188a = cVar;
        this.f25189b = linkedHashMap;
        this.f25190c = context;
        this.f25191d = itemType;
        this.f25192e = new LinkedHashMap();
        AddressField addressField = AddressField.NAME;
        Boolean bool = Boolean.TRUE;
        Pair pair = new Pair(addressField, bool);
        AddressField addressField2 = AddressField.EMAIL;
        Pair pair2 = new Pair(addressField2, bool);
        AddressField addressField3 = AddressField.PHONE_COUNTRY_CODE;
        Pair pair3 = new Pair(addressField3, bool);
        AddressField addressField4 = AddressField.PHONE_NUMBER;
        Pair pair4 = new Pair(addressField4, bool);
        AddressField addressField5 = AddressField.ADDRESS_LINE1;
        Pair pair5 = new Pair(addressField5, bool);
        AddressField addressField6 = AddressField.ADDRESS_LINE2;
        Boolean bool2 = Boolean.FALSE;
        Pair pair6 = new Pair(addressField6, bool2);
        AddressField addressField7 = AddressField.STREET_NAME;
        Pair pair7 = new Pair(addressField7, bool);
        AddressField addressField8 = AddressField.HOUSE_NUMBER;
        Pair pair8 = new Pair(addressField8, bool);
        AddressField addressField9 = AddressField.HOUSE_NUMBER_ADDITION;
        Pair pair9 = new Pair(addressField9, bool2);
        AddressField addressField10 = AddressField.POSTAL_CODE;
        Pair pair10 = new Pair(addressField10, bool);
        AddressField addressField11 = AddressField.CITY;
        Pair pair11 = new Pair(addressField11, bool);
        AddressField addressField12 = AddressField.STATE;
        Pair pair12 = new Pair(addressField12, bool);
        AddressField addressField13 = AddressField.COUNTRY_CODE;
        Pair pair13 = new Pair(addressField13, bool);
        AddressField addressField14 = AddressField.DELIVERY_ACCESS_CODE;
        Pair pair14 = new Pair(addressField14, bool2);
        AddressField addressField15 = AddressField.DELIVERY_NO_ACCESS_CODE;
        Pair pair15 = new Pair(addressField15, bool2);
        AddressField addressField16 = AddressField.DELIVERY_INSTRUCTIONS;
        this.f25194g = x0.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(addressField16, bool2));
        e eVar = e.TextCapSentences;
        Pair pair16 = new Pair(addressField, eVar);
        Pair pair17 = new Pair(addressField2, e.TextEmailAddress);
        e eVar2 = e.Number;
        this.f25195h = x0.f(pair16, pair17, new Pair(addressField3, eVar2), new Pair(addressField4, eVar2), new Pair(addressField5, eVar), new Pair(addressField6, eVar), new Pair(addressField7, eVar), new Pair(addressField8, eVar2), new Pair(addressField9, e.TextNoSuggestions), new Pair(addressField10, eVar2), new Pair(addressField11, eVar), new Pair(addressField12, eVar), new Pair(addressField13, eVar), new Pair(addressField14, eVar), new Pair(addressField16, e.TextMultiLine));
        this.f25196i = x0.f(new Pair(addressField, 1), new Pair(addressField2, 5), new Pair(addressField3, 1), new Pair(addressField4, 5), new Pair(addressField5, 1), new Pair(addressField6, 0), new Pair(addressField7, 0), new Pair(addressField8, 1), new Pair(addressField9, 0), new Pair(addressField10, 2), new Pair(addressField11, 1), new Pair(addressField12, 1), new Pair(addressField13, 1), new Pair(addressField14, 0), new Pair(addressField16, 0));
        this.f25197j = x0.f(new Pair(addressField, 40), new Pair(addressField2, 50), new Pair(addressField3, 5), new Pair(addressField4, 15), new Pair(addressField5, 40), new Pair(addressField6, 40), new Pair(addressField7, 40), new Pair(addressField8, 8), new Pair(addressField9, 20), new Pair(addressField10, 10), new Pair(addressField11, 30), new Pair(addressField12, 30), new Pair(addressField13, 40), new Pair(addressField14, 40), new Pair(addressField16, 255));
        this.f25198k = x0.f(new Pair(addressField, null), new Pair(addressField2, null), new Pair(addressField3, "^([0-9]{1,4})$"), new Pair(addressField4, "^\\s*(?:[(]*(\\d{1,3})[)]*)?([0-9 ]{4,14})\\s*$"), new Pair(addressField5, null), new Pair(addressField6, null), new Pair(addressField7, null), new Pair(addressField8, null), new Pair(addressField9, null), new Pair(addressField10, null), new Pair(addressField11, null), new Pair(addressField12, null), new Pair(addressField13, null), new Pair(addressField14, null), new Pair(addressField16, null));
        this.l = x0.f(new Pair(addressField, bool), new Pair(addressField2, bool), new Pair(addressField3, bool), new Pair(addressField4, bool), new Pair(addressField5, bool), new Pair(addressField6, bool), new Pair(addressField7, bool2), new Pair(addressField8, bool2), new Pair(addressField9, bool2), new Pair(addressField10, bool), new Pair(addressField11, bool), new Pair(addressField12, bool2), new Pair(addressField13, bool), new Pair(addressField14, bool2), new Pair(addressField15, bool2), new Pair(addressField16, bool2));
        Pair pair18 = new Pair(addressField, Integer.valueOf(R.string.mnu_checkout_address_name_label_v2));
        Pair pair19 = new Pair(addressField2, Integer.valueOf(R.string.mnu_checkout_address_email_label));
        Integer numValueOf = Integer.valueOf(R.string.mnu_checkout_address_phone_label);
        this.f25199m = x0.f(pair18, pair19, new Pair(addressField3, numValueOf), new Pair(addressField4, numValueOf), new Pair(addressField5, Integer.valueOf(R.string.mnu_checkout_address_address_1_label_v2)), new Pair(addressField6, Integer.valueOf(R.string.mnu_checkout_address_address_2_label_v_italy)), new Pair(addressField7, Integer.valueOf(R.string.mnu_checkout_address_address_1_nl)), new Pair(addressField8, Integer.valueOf(R.string.mnu_checkout_address_house_number_label)), new Pair(addressField9, Integer.valueOf(R.string.mnu_checkout_address_house_addition_label_v2)), new Pair(addressField10, Integer.valueOf(R.string.mnu_checkout_address_postal_label)), new Pair(addressField11, Integer.valueOf(R.string.mnu_checkout_address_city_label)), new Pair(addressField12, Integer.valueOf(R.string.mnu_checkout_address_province)), new Pair(addressField13, Integer.valueOf(R.string.profile_edit_address_country)), new Pair(addressField14, Integer.valueOf(R.string.catering_address_access_or_security_code_label)), new Pair(addressField15, Integer.valueOf(R.string.catering_address_no_access_code_required)), new Pair(addressField16, Integer.valueOf(R.string.catering_address_additional_instructions_label)));
        this.f25200n = x0.f(new Pair(addressField, null), new Pair(addressField2, null), new Pair(addressField3, null), new Pair(addressField4, null), new Pair(addressField5, null), new Pair(addressField6, h()), new Pair(addressField7, null), new Pair(addressField8, null), new Pair(addressField9, h()), new Pair(addressField10, null), new Pair(addressField11, null), new Pair(addressField12, null), new Pair(addressField13, null), new Pair(addressField14, null), new Pair(addressField15, null), new Pair(addressField16, null));
        LinkedHashMap linkedHashMapF = x0.f(new Pair(addressField, null), new Pair(addressField2, null), new Pair(addressField3, null), new Pair(addressField4, null), new Pair(addressField5, null), new Pair(addressField6, null), new Pair(addressField7, null), new Pair(addressField8, null), new Pair(addressField9, null), new Pair(addressField10, null), new Pair(addressField11, null), new Pair(addressField12, null), new Pair(addressField13, null), new Pair(addressField14, null), new Pair(addressField15, null), new Pair(addressField16, null));
        this.f25201o = linkedHashMapF;
        Pair pair20 = new Pair(addressField, Integer.valueOf(R.string.mnu_checkout_address_validation_format_name));
        Pair pair21 = new Pair(addressField2, Integer.valueOf(R.string.mnu_checkout_address_validation_format_email));
        Integer numValueOf2 = Integer.valueOf(R.string.mnu_checkout_address_validation_format_phone);
        LinkedHashMap linkedHashMapF2 = x0.f(pair20, pair21, new Pair(addressField3, numValueOf2), new Pair(addressField4, numValueOf2), new Pair(addressField5, Integer.valueOf(R.string.mnu_checkout_address_validation_format_address)), new Pair(addressField6, Integer.valueOf(R.string.mnu_checkout_address_validation_format_address_addition)), new Pair(addressField7, Integer.valueOf(R.string.mnu_checkout_address_validation_format_street_name)), new Pair(addressField8, Integer.valueOf(R.string.mnu_checkout_address_validation_format_house_number)), new Pair(addressField9, Integer.valueOf(R.string.mnu_checkout_address_validation_format_house_number_addition)), new Pair(addressField10, Integer.valueOf(R.string.mnu_checkout_address_validation_format_postal_code)), new Pair(addressField11, Integer.valueOf(R.string.mnu_checkout_address_validation_format_city)), new Pair(addressField12, null), new Pair(addressField13, null), new Pair(addressField14, Integer.valueOf(R.string.catering_checkout_address_validation_format_access_code)), new Pair(addressField15, null), new Pair(addressField16, null));
        this.f25202p = linkedHashMapF2;
        this.f25203q = x0.f(new Pair(addressField, null), new Pair(addressField2, null), new Pair(addressField3, null), new Pair(addressField4, null), new Pair(addressField5, null), new Pair(addressField6, null), new Pair(addressField7, null), new Pair(addressField8, null), new Pair(addressField9, null), new Pair(addressField10, null), new Pair(addressField11, null), new Pair(addressField12, null), new Pair(addressField13, null), new Pair(addressField14, null), new Pair(addressField15, null), new Pair(addressField16, null));
        ItemType itemType2 = this.f25191d;
        Integer numValueOf3 = Integer.valueOf(R.string.mnu_checkout_address_validation_format_phone_poland);
        Integer numValueOf4 = Integer.valueOf(R.string.mnu_checkout_address_address_2_label);
        LinkedHashMap linkedHashMap2 = this.l;
        LinkedHashMap linkedHashMap3 = this.f25199m;
        LinkedHashMap linkedHashMap4 = this.f25195h;
        LinkedHashMap linkedHashMap5 = this.f25197j;
        Context context2 = this.f25190c;
        switch (i.$EnumSwitchMapping$2[this.f25188a.ordinal()]) {
            case 1:
                linkedHashMapF.put(addressField10, "1234");
                linkedHashMap3.put(addressField6, numValueOf4);
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_denmark);
                break;
            case 2:
                o();
                linkedHashMapF.put(addressField10, "1234 AB");
                linkedHashMap4.put(addressField10, e.TextAllCaps);
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_netherlands);
                break;
            case 3:
                o();
                linkedHashMapF.put(addressField10, "1234");
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_belgium);
                break;
            case 4:
                o();
                linkedHashMapF.put(addressField10, "1234");
                linkedHashMap4.put(addressField10, e.TextAllCaps);
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_austria);
                break;
            case 5:
                o();
                linkedHashMapF.put(addressField10, "12345");
                linkedHashMap4.put(addressField10, e.TextAllCaps);
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_germany);
                break;
            case 6:
                linkedHashMapF.put(addressField10, "12345");
                this.f25198k.put(addressField, ".*\\p{L} +\\p{L}.*");
                linkedHashMap2.put(addressField12, bool);
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_italy);
                break;
            case 7:
                linkedHashMapF.put(addressField10, "12345");
                linkedHashMap2.put(addressField12, bool);
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_es_mainland);
                break;
            case 8:
                linkedHashMapF.put(addressField10, "1234-567");
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_pt_mainland);
                break;
            case 9:
                linkedHashMapF.put(addressField10, "12345");
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_france_metro);
                break;
            case 10:
                linkedHashMapF.put(addressField10, "AA11 1AA");
                linkedHashMap4.put(addressField10, e.TextAllCaps);
                linkedHashMap3.put(addressField6, numValueOf4);
                this.f25193f = itemType2 == ItemType.CATERING ? context2.getString(R.string.catering_checkout_address_country_warning_uk) : context2.getString(R.string.mnu_checkout_address_country_warning_uk_mainland);
                p();
                break;
            case 11:
                o();
                linkedHashMapF.put(addressField10, "12-345");
                linkedHashMapF2.put(addressField3, numValueOf3);
                linkedHashMapF2.put(addressField4, numValueOf3);
                this.f25193f = itemType2 == ItemType.CATERING ? context2.getString(R.string.catering_checkout_address_country_warning_poland) : context2.getString(R.string.mnu_checkout_address_country_warning_poland);
                p();
                break;
            case 12:
                linkedHashMap3.put(addressField12, Integer.valueOf(R.string.mnu_checkout_address_state));
                linkedHashMapF.put(addressField10, "12345");
                linkedHashMap2.put(addressField12, bool);
                linkedHashMap3.put(addressField6, numValueOf4);
                this.f25193f = context2.getString(R.string.mnu_checkout_address_country_warning_usa);
                break;
            default:
                o();
                linkedHashMapF.put(addressField10, "12345");
                linkedHashMap4.put(addressField10, e.TextAllCaps);
                linkedHashMap5.put(addressField, 60);
                linkedHashMap5.put(addressField2, 50);
                linkedHashMap5.put(addressField5, 30);
                linkedHashMap5.put(addressField8, 5);
                linkedHashMap5.put(addressField9, 10);
                linkedHashMap5.put(addressField10, 10);
                linkedHashMap5.put(addressField11, 30);
                linkedHashMap5.put(addressField3, 4);
                linkedHashMap5.put(addressField4, 13);
                break;
        }
        this.f25192e.clear();
        for (AddressField addressField17 : AddressField.getEntries()) {
            LinkedHashMap linkedHashMap6 = this.f25192e;
            Map map = this.f25189b;
            boolean zBooleanValue = ((map == null || (addressFieldSpec8 = (AddressFieldSpec) map.get(addressField17)) == null || (required = addressFieldSpec8.getRequired()) == null) && (required = (Boolean) this.f25194g.get(addressField17)) == null) ? true : required.booleanValue();
            Map map2 = this.f25189b;
            e eVarA = a(addressField17, (map2 == null || (addressFieldSpec7 = (AddressFieldSpec) map2.get(addressField17)) == null) ? null : addressFieldSpec7.getKeyboardType());
            Map map3 = this.f25189b;
            int iIntValue = ((map3 == null || (addressFieldSpec6 = (AddressFieldSpec) map3.get(addressField17)) == null || (maxLength = addressFieldSpec6.getMaxLength()) == null) && (maxLength = (Integer) this.f25197j.get(addressField17)) == null) ? 40 : maxLength.intValue();
            Map map4 = this.f25189b;
            String str = "";
            if ((map4 == null || (addressFieldSpec5 = (AddressFieldSpec) map4.get(addressField17)) == null || (regex = addressFieldSpec5.getRegex()) == null) && (regex = (String) this.f25198k.get(addressField17)) == null) {
                regex = "";
            }
            linkedHashMap6.put(addressField17, new h(zBooleanValue, eVarA, iIntValue, regex));
            AddressField addressField18 = AddressField.STREET_NAME;
            if (addressField17 == addressField18 && k(addressField18)) {
                LinkedHashMap linkedHashMap7 = this.f25192e;
                AddressField addressField19 = AddressField.ADDRESS_LINE1;
                Map map5 = this.f25189b;
                boolean zBooleanValue2 = ((map5 == null || (addressFieldSpec4 = (AddressFieldSpec) map5.get(addressField17)) == null || (required2 = addressFieldSpec4.getRequired()) == null) && (required2 = (Boolean) this.f25194g.get(addressField17)) == null) ? true : required2.booleanValue();
                Map map6 = this.f25189b;
                e eVarA2 = a(addressField17, (map6 == null || (addressFieldSpec3 = (AddressFieldSpec) map6.get(addressField17)) == null) ? null : addressFieldSpec3.getKeyboardType());
                Map map7 = this.f25189b;
                int iIntValue2 = ((map7 == null || (addressFieldSpec2 = (AddressFieldSpec) map7.get(addressField17)) == null || (maxLength2 = addressFieldSpec2.getMaxLength()) == null) && (maxLength2 = (Integer) this.f25197j.get(addressField17)) == null) ? 40 : maxLength2.intValue();
                Map map8 = this.f25189b;
                if (map8 == null || (addressFieldSpec = (AddressFieldSpec) map8.get(addressField17)) == null || (regex2 = addressFieldSpec.getRegex()) == null) {
                    String str2 = (String) this.f25198k.get(addressField17);
                    if (str2 != null) {
                        str = str2;
                    }
                } else {
                    str = regex2;
                }
                linkedHashMap7.put(addressField19, new h(zBooleanValue2, eVarA2, iIntValue2, str));
            }
        }
    }

    public final e a(AddressField addressField, ServerKeyboardTypes serverKeyboardTypes) {
        int i11 = serverKeyboardTypes == null ? -1 : i.$EnumSwitchMapping$1[serverKeyboardTypes.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return e.Number;
            }
            if (i11 == 3) {
                return e.TextEmailAddress;
            }
            if (i11 == 4) {
                return e.TextAllCaps;
            }
            e eVar = (e) this.f25195h.get(addressField);
            return eVar == null ? e.Text : eVar;
        }
        switch (i.$EnumSwitchMapping$0[addressField.ordinal()]) {
            case 1:
                return e.TextCapSentences;
            case 2:
                return e.TextCapSentences;
            case 3:
                return e.TextCapSentences;
            case 4:
                return e.TextCapSentences;
            case 5:
                return e.TextNoSuggestions;
            case 6:
                return e.TextCapSentences;
            case 7:
                return e.TextCapSentences;
            case 8:
                return e.TextCapSentences;
            case 9:
                return e.TextMultiLine;
            default:
                return e.Text;
        }
    }

    public final String b(AddressField addressField) {
        addressField.getClass();
        Integer num = (Integer) this.f25199m.get(addressField);
        if (num == null) {
            return "";
        }
        String string = this.f25190c.getString(num.intValue());
        string.getClass();
        return string;
    }

    public final String c(AddressField addressField) {
        Integer num;
        addressField.getClass();
        LinkedHashMap linkedHashMap = this.f25203q;
        String str = (String) linkedHashMap.get(addressField);
        String string = "";
        if (str != null) {
            if (str.length() > 0) {
                linkedHashMap.put(addressField, null);
            } else {
                str = "";
            }
            string = str;
        }
        int length = string.length();
        Context context = this.f25190c;
        if (length == 0 && (num = (Integer) this.f25202p.get(addressField)) != null) {
            string = context.getString(num.intValue());
            string.getClass();
        }
        if (string.length() != 0) {
            return string;
        }
        String string2 = context.getString(R.string.mnu_checkout_address_validation_required);
        string2.getClass();
        return string2;
    }

    public final boolean d(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        return hVar != null && hVar.f25181e;
    }

    public final boolean e(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        return hVar != null && hVar.f25182f;
    }

    public final int f(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        e eVar = hVar != null ? hVar.f25178b : null;
        switch (eVar == null ? -1 : i.$EnumSwitchMapping$3[eVar.ordinal()]) {
            case 1:
                return BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
            case 2:
                return 32;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
            default:
                return 1;
            case 6:
                return 524288;
            case 7:
                return 4096;
            case 8:
                return 131072;
        }
    }

    public final int g(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        if (hVar != null) {
            return hVar.f25179c;
        }
        Integer num = (Integer) this.f25196i.get(addressField);
        if (num != null) {
            return num.intValue();
        }
        return 30;
    }

    public final String h() {
        String strValueOf;
        String string = this.f25190c.getString(R.string.mnu_checkout_address_optional_label);
        string.getClass();
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = string.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            strValueOf = CharsKt.c(cCharAt, locale);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb2.append((Object) strValueOf);
        sb2.append(string.substring(1));
        return sb2.toString();
    }

    public final String i(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        if (hVar != null) {
            return hVar.f25180d;
        }
        return null;
    }

    public final boolean j(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        Boolean boolValueOf = hVar != null ? Boolean.valueOf(hVar.f25177a) : null;
        boolValueOf.getClass();
        return boolValueOf.booleanValue();
    }

    public final boolean k(AddressField addressField) {
        addressField.getClass();
        Boolean bool = (Boolean) this.l.get(addressField);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void l(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        if (hVar != null) {
            hVar.f25181e = true;
        }
    }

    public final void m(AddressField addressField, boolean z11) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        if (hVar != null) {
            hVar.f25183g = z11;
        }
    }

    public final void n(AddressField addressField) {
        addressField.getClass();
        h hVar = (h) this.f25192e.get(addressField);
        if (hVar != null) {
            hVar.f25182f = true;
        }
    }

    public final void o() {
        AddressField addressField = AddressField.ADDRESS_LINE1;
        this.f25199m.put(addressField, Integer.valueOf(R.string.mnu_checkout_address_address_1_nl));
        Boolean bool = Boolean.FALSE;
        LinkedHashMap linkedHashMap = this.l;
        linkedHashMap.put(addressField, bool);
        linkedHashMap.put(AddressField.ADDRESS_LINE2, bool);
        AddressField addressField2 = AddressField.STREET_NAME;
        Boolean bool2 = Boolean.TRUE;
        linkedHashMap.put(addressField2, bool2);
        linkedHashMap.put(AddressField.HOUSE_NUMBER, bool2);
        linkedHashMap.put(AddressField.HOUSE_NUMBER_ADDITION, bool2);
    }

    public final void p() {
        ItemType itemType = ItemType.CATERING;
        ItemType itemType2 = this.f25191d;
        boolean z11 = itemType2 == itemType || itemType2 == null;
        AddressField addressField = AddressField.DELIVERY_ACCESS_CODE;
        Boolean boolValueOf = Boolean.valueOf(z11);
        LinkedHashMap linkedHashMap = this.l;
        linkedHashMap.put(addressField, boolValueOf);
        linkedHashMap.put(AddressField.DELIVERY_NO_ACCESS_CODE, Boolean.valueOf(z11));
        linkedHashMap.put(AddressField.DELIVERY_INSTRUCTIONS, Boolean.valueOf(z11));
    }
}
