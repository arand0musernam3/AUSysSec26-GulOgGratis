package tx;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f40507a;

    static {
        HashMap map = new HashMap();
        f40507a = map;
        map.put(Boolean.class, new e(0));
        map.put(Integer.class, new e(1));
        map.put(Long.class, new e(2));
        map.put(Double.class, new e(3));
        map.put(String.class, new e(4));
        map.put(String[].class, new e(5));
        map.put(JSONArray.class, new e(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    e eVar = (e) f40507a.get(obj.getClass());
                    if (eVar == null) {
                        j4.d.t(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    next.getClass();
                    int i11 = eVar.f40506a;
                    next.getClass();
                    switch (i11) {
                        case 0:
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(next, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(next, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(next, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() != 0) {
                                int length = jSONArray.length();
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        bundle.putStringArrayList(next, arrayList);
                                    } else {
                                        Object obj2 = jSONArray.get(i12);
                                        if (!(obj2 instanceof String)) {
                                            j4.d.t(obj2.getClass(), "Unexpected type in an array: ");
                                        } else {
                                            arrayList.add(obj2);
                                            i12++;
                                        }
                                    }
                                }
                            } else {
                                bundle.putStringArrayList(next, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(next, a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }
}
