package c50;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.WindowInsetsCompat;
import co.datadome.sdk.ChallengeActivity;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.tasks.Task;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import kotlin.reflect.KProperty;
import kotlinx.serialization.UnknownFieldException;
import org.json.JSONException;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements u30.e, yi.v, h7.w, d10.b, q40.a, ty.e, ActivityResultCallback, dz.e, e40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7648a;

    public /* synthetic */ w(com.google.firebase.messaging.q qVar) {
        this.f7648a = 15;
    }

    public static /* synthetic */ void d() {
        throw new UnsupportedOperationException();
    }

    public static void e(int i11) {
        throw new UnknownFieldException(j4.s.f(i11, "An unknown field for index "));
    }

    public static /* synthetic */ void f(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append((Object) "serialized size must be non-negative, was ");
        sb2.append(i12);
        throw new IllegalStateException(sb2.toString());
    }

    public static /* synthetic */ void h(int i11, Object obj, Object obj2, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        sb2.append(i11);
        sb2.append((Object) " parameters found ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void j(Class cls, JSONException jSONException) {
        throw new ModelSerializationException(cls, jSONException);
    }

    public static /* synthetic */ void k(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb2.toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new NullPointerException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, int i11) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i11));
    }

    public static /* synthetic */ void n() throws zzaeg {
        throw new zzaeg();
    }

    public static /* synthetic */ void o(String str) throws zzaeh {
        throw new zzaeh(str);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        int i11 = LoginButton.f10988y;
    }

    @Override // ty.e
    public Object apply(Object obj) {
        switch (this.f7648a) {
            case 16:
                z40.e eVar = (z40.e) obj;
                j30.g gVar = com.google.firebase.messaging.u.f12884a;
                gVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gVar.g(eVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 21:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        t5.a aVarA = wy.i.a();
                        aVarA.J(cursorRawQuery.getString(1));
                        aVarA.f39793d = gz.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        aVarA.f39792c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(aVarA.f());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            default:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
        }
    }

    @Override // yi.v
    public void b() {
        int i11 = MainCharityActivity.f8980h;
    }

    @Override // e40.b
    public Object c(JsonReader jsonReader) throws IOException {
        switch (this.f7648a) {
            case 27:
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                l("Null libraryName");
                                return null;
                            }
                            break;
                            break;
                        case "arch":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                l("Null arch");
                                return null;
                            }
                            break;
                            break;
                        case "buildId":
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                l("Null buildId");
                                return null;
                            }
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (strNextString != null && strNextString2 != null && strNextString3 != null) {
                    return new d40.e0(strNextString, strNextString2, strNextString3);
                }
                StringBuilder sb2 = new StringBuilder();
                if (strNextString == null) {
                    sb2.append(" arch");
                }
                if (strNextString2 == null) {
                    sb2.append(" libraryName");
                }
                if (strNextString3 == null) {
                    sb2.append(" buildId");
                }
                h2.b(w.a0.q("Missing required properties:", sb2));
                return null;
            case 28:
                jsonReader.beginObject();
                String strNextString4 = null;
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString4 = jsonReader.nextString();
                        if (strNextString4 == null) {
                            l("Null filename");
                            return null;
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            l("Null contents");
                            return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString4 != null && bArrDecode != null) {
                    return new d40.h0(strNextString4, bArrDecode);
                }
                StringBuilder sb3 = new StringBuilder();
                if (strNextString4 == null) {
                    sb3.append(" filename");
                }
                if (bArrDecode == null) {
                    sb3.append(" contents");
                }
                h2.b(w.a0.q("Missing required properties:", sb3));
                return null;
            default:
                d40.d1 d1Var = new d40.d1();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "parameterKey":
                            String strNextString5 = jsonReader.nextString();
                            if (strNextString5 == null) {
                                l("Null parameterKey");
                                return null;
                            }
                            d1Var.f14136b = strNextString5;
                            break;
                            break;
                        case "templateVersion":
                            d1Var.f14138d = jsonReader.nextLong();
                            d1Var.f14139e = (byte) (d1Var.f14139e | 1);
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String strNextString6 = null;
                            String strNextString7 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName4 = jsonReader.nextName();
                                strNextName4.getClass();
                                if (strNextName4.equals("variantId")) {
                                    strNextString7 = jsonReader.nextString();
                                    if (strNextString7 == null) {
                                        l("Null variantId");
                                        return null;
                                    }
                                } else if (strNextName4.equals("rolloutId")) {
                                    strNextString6 = jsonReader.nextString();
                                    if (strNextString6 == null) {
                                        l("Null rolloutId");
                                        return null;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString6 != null && strNextString7 != null) {
                                d1Var.f14135a = new d40.f1(strNextString6, strNextString7);
                                break;
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                if (strNextString6 == null) {
                                    sb4.append(" rolloutId");
                                }
                                if (strNextString7 == null) {
                                    sb4.append(" variantId");
                                }
                                h2.b(w.a0.q("Missing required properties:", sb4));
                                return null;
                            }
                            break;
                        case "parameterValue":
                            String strNextString8 = jsonReader.nextString();
                            if (strNextString8 == null) {
                                l("Null parameterValue");
                                return null;
                            }
                            d1Var.f14137c = strNextString8;
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return d1Var.a();
        }
    }

    @Override // d10.b
    public Object g(Task task) throws IOException {
        int i11;
        switch (this.f7648a) {
            case 12:
                i11 = AppConstants.STATUS_CODE_FORBIDDEN;
                break;
            case 13:
                i11 = -1;
                break;
            default:
                Bundle bundle = (Bundle) task.k();
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null) {
                        return string;
                    }
                    String string2 = bundle.getString("unregistered");
                    if (string2 != null) {
                        return string2;
                    }
                    String string3 = bundle.getString(StatusResponseUtils.RESULT_ERROR);
                    if ("RST".equals(string3)) {
                        i4.a.k("INSTANCE_ID_RESET");
                    } else if (string3 != null) {
                        i4.a.k(string3);
                    } else {
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        i4.a.k("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    i4.a.k("SERVICE_NOT_AVAILABLE");
                }
                return null;
        }
        return Integer.valueOf(i11);
    }

    @Override // u30.e
    public Object i(q2 q2Var) {
        return FirebaseSessionsRegistrar.getComponents$lambda$1(q2Var);
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        KProperty[] kPropertyArr = ChallengeActivity.f8613m;
        x6.d dVarE = windowInsetsCompat.e(h7.h2.b() | h7.h2.h());
        dVarE.getClass();
        view.setPadding(dVarE.f43873a, dVarE.f43874b, dVarE.f43875c, dVarE.f43876d);
        return WindowInsetsCompat.f2740b;
    }

    public /* synthetic */ w(int i11) {
        this.f7648a = i11;
    }
}
