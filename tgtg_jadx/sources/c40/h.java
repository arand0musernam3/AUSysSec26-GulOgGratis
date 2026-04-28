package c40;

import android.util.Log;
import j4.s;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f7067b = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g40.b f7068a;

    public h(g40.b bVar) {
        this.f7068a = bVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String string = jSONArray.getString(i11);
            try {
                arrayList.add(p.a(string));
            } catch (Exception e5) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e5);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                jSONArray.put(new JSONObject(p.f7089a.e(list.get(i11))));
            } catch (JSONException e5) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e5);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", s.k("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z11) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e5;
        g40.b bVar = this.f7068a;
        File fileH = z11 ? bVar.h(str, "internal-keys") : bVar.h(str, "keys");
        if (!fileH.exists() || fileH.length() == 0) {
            g(fileH, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileH);
                try {
                    HashMap mapA = a(a40.g.i(fileInputStream));
                    a40.g.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e11) {
                    e5 = e11;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e5);
                    f(fileH);
                    a40.g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th3) {
                th2 = th3;
                a40.g.b(, "Failed to close user metadata file.");
                throw th2;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e5 = e12;
        } catch (Throwable th4) {
            ?? r12 = 0;
            th2 = th4;
            a40.g.b(r12, "Failed to close user metadata file.");
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileH = this.f7068a.h(str, "user-data");
        ?? r62 = 0;
        if (fileH.exists()) {
            ?? r32 = (fileH.length() > 0L ? 1 : (fileH.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileH);
                        try {
                            JSONObject jSONObject = new JSONObject(a40.g.i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            a40.g.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e5) {
                            e = e5;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileH);
                            a40.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        a40.g.b(r62, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r62 = r32;
            }
        }
        String strK = e0.f.k("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
        f(fileH);
        return null;
    }

    public final void h(String str, Map map, boolean z11) {
        String string;
        BufferedWriter bufferedWriter;
        g40.b bVar = this.f7068a;
        File fileH = z11 ? bVar.h(str, "internal-keys") : bVar.h(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                string = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH), f7067b));
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            a40.g.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(fileH);
            a40.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            a40.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String string;
        BufferedWriter bufferedWriter;
        File fileH = this.f7068a.h(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                g gVar = new g();
                gVar.put("userId", str2);
                string = gVar.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH), f7067b));
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            a40.g.b(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            a40.g.b(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            a40.g.b(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
