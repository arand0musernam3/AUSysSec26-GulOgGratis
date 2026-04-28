package com.braze.triggers.conditions;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10809e = BrazeLogger.getBrazeLogTag((Class<?>) g.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.a f10810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10813d;

    public g(JSONObject jSONObject) throws JSONException {
        com.braze.triggers.enums.a aVar = (com.braze.triggers.enums.a) JsonUtils.optEnum(jSONObject, "property_type", com.braze.triggers.enums.a.class, com.braze.triggers.enums.a.UNKNOWN);
        String string = jSONObject.getString("property_key");
        int i11 = jSONObject.getInt("comparator");
        this.f10810a = aVar;
        this.f10811b = string;
        this.f10812c = i11;
        if (jSONObject.has("property_value")) {
            if (aVar.equals(com.braze.triggers.enums.a.STRING)) {
                this.f10813d = jSONObject.getString("property_value");
                return;
            }
            if (aVar.equals(com.braze.triggers.enums.a.BOOLEAN)) {
                this.f10813d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.NUMBER)) {
                this.f10813d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.DATE)) {
                this.f10813d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Object objOpt;
        if (!(bVar instanceof com.braze.triggers.events.c)) {
            return false;
        }
        BrazeProperties brazeProperties = ((com.braze.triggers.events.j) ((com.braze.triggers.events.c) bVar)).f10850e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                objOpt = brazeProperties.getJsonObject().opt(this.f10811b);
            } catch (Exception e5) {
                BrazeLogger.e(f10809e, "Caught exception checking property filter condition.", e5);
                return false;
            }
        } else {
            objOpt = null;
        }
        int i11 = this.f10812c;
        if (objOpt == null) {
            return i11 == 12 || i11 == 17 || i11 == 2;
        }
        if (i11 == 11) {
            return true;
        }
        if (i11 == 12) {
            return false;
        }
        int iOrdinal = this.f10810a.ordinal();
        if (iOrdinal == 0) {
            return a(objOpt);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return false;
                }
                boolean z11 = objOpt instanceof Boolean;
                int i12 = this.f10812c;
                if (z11) {
                    if (i12 == 1) {
                        return objOpt.equals(this.f10813d);
                    }
                    if (i12 == 2) {
                        return !objOpt.equals(this.f10813d);
                    }
                } else if (i12 == 2) {
                    return true;
                }
                return false;
            }
            if (!(objOpt instanceof Integer) && !(objOpt instanceof Double)) {
                if (this.f10812c == 2) {
                }
            }
            double dDoubleValue = ((Number) objOpt).doubleValue();
            double dDoubleValue2 = ((Number) this.f10813d).doubleValue();
            int i13 = this.f10812c;
            if (i13 == 1) {
                return dDoubleValue == dDoubleValue2;
            }
            if (i13 == 2) {
                if (dDoubleValue != dDoubleValue2) {
                }
            }
            if (i13 == 3) {
                if (dDoubleValue > dDoubleValue2) {
                }
            }
            if (i13 == 5 && dDoubleValue < dDoubleValue2) {
            }
        }
        long j9 = ((com.braze.triggers.events.i) bVar).f10847a;
        if (objOpt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) objOpt, BrazeDateFormat.LONG);
            } catch (Exception e11) {
                BrazeLogger.e(f10809e, "Caught exception trying to parse date in compareTimestamps", e11);
            }
        }
        if (date != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long jLongValue = ((Number) this.f10813d).longValue();
            int i14 = this.f10812c;
            if (i14 != 15) {
                if (i14 != 16) {
                    switch (i14) {
                        case 1:
                            if (timeFromEpochInSeconds != jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 2:
                            if (timeFromEpochInSeconds == jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 3:
                            if (timeFromEpochInSeconds <= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 4:
                            if (timeFromEpochInSeconds < j9 - jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j9 - jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j9 + jLongValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j9 + jLongValue) {
                return false;
            }
        } else if (this.f10812c != 2) {
            return false;
        }
        return true;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f10810a.equals(com.braze.triggers.enums.a.UNKNOWN)) {
                jSONObject.put("property_type", this.f10810a.toString());
            }
            jSONObject.put("property_key", this.f10811b);
            jSONObject.put("comparator", this.f10812c);
            jSONObject.put("property_value", this.f10813d);
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.e(f10809e, "Caught exception creating property filter Json.", e5);
            return jSONObject;
        }
    }

    public final boolean a(Object obj) {
        boolean z11 = obj instanceof String;
        int i11 = this.f10812c;
        if (!z11) {
            return i11 == 2 || i11 == 17;
        }
        if (i11 == 1) {
            return obj.equals(this.f10813d);
        }
        if (i11 == 2) {
            return !obj.equals(this.f10813d);
        }
        if (i11 == 10) {
            return Pattern.compile((String) this.f10813d, 2).matcher((String) obj).find();
        }
        if (i11 != 17) {
            return false;
        }
        return !Pattern.compile((String) this.f10813d, 2).matcher((String) obj).find();
    }
}
