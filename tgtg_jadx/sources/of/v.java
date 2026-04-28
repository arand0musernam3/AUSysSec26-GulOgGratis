package of;

import com.google.android.gms.internal.measurement.cg;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import u70.c0;
import v80.b0;
import v80.f0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f32532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kf.b f32534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f32535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v80.x f32536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f32537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x80.i f32538g;

    public v(File file, String str, String str2, kf.b bVar, b0 b0Var, v80.x xVar) {
        file.getClass();
        str.getClass();
        str2.getClass();
        bVar.getClass();
        this.f32532a = file;
        this.f32533b = str2;
        this.f32534c = bVar;
        this.f32535d = b0Var;
        this.f32536e = xVar;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        long j9 = -3750763034362895579L;
        for (long j11 : bytes) {
            u70.b0 b0Var2 = c0.f40833b;
            j9 = (j9 ^ (j11 & 255)) * 1099511628211L;
        }
        this.f32537f = StringsKt.M(16, kotlin.text.c0.b(j9));
        this.f32538g = cg.a(8192, null, null, 6);
        f0.B(this.f32535d, this.f32536e, null, new mn.g(this, null, 12), 2);
    }

    public static final void a(v vVar, p pVar, File file) {
        kf.b bVar = vVar.f32534c;
        Map map = pVar.f32525a;
        if (map != null) {
            try {
                vVar.h(map, file);
            } catch (IOException e5) {
                bVar.a("DiagnosticsStorage: Failed to write tags: " + e5.getMessage());
            }
        }
        Map map2 = pVar.f32526b;
        if (map2 != null) {
            try {
                vVar.e(map2, file);
            } catch (IOException e11) {
                bVar.a("DiagnosticsStorage: Failed to write counters: " + e11.getMessage());
            }
        }
        Map map3 = pVar.f32527c;
        if (map3 != null) {
            try {
                vVar.g(map3, file);
            } catch (IOException e12) {
                bVar.a("DiagnosticsStorage: Failed to write histograms: " + e12.getMessage());
            }
        }
        List list = pVar.f32528d;
        if (list != null) {
            try {
                vVar.f(list, file);
            } catch (IOException e13) {
                bVar.a("DiagnosticsStorage: Failed to write events: " + e13.getMessage());
            }
        }
    }

    public static final void b(v vVar) {
        File file = new File(new File(new File(vVar.f32532a, "com.amplitude.diagnostics"), vVar.f32537f), vVar.f32533b);
        if (file.exists()) {
            new File(file, "counters.json").delete();
            new File(file, "counters.json.tmp").delete();
            new File(file, "histograms.json").delete();
            new File(file, "histograms.json.tmp").delete();
            new File(file, "events.log").delete();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    name.getClass();
                    if (kotlin.text.y.p(name, "events-", false) && kotlin.text.y.j(name, ".log", false)) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public static void c(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    c(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    public static JSONObject i(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charsets.UTF_8));
            try {
                JSONObject jSONObject = new JSONObject(v0.n.D(bufferedReader));
                bufferedReader.close();
                fileInputStream.close();
                return jSONObject;
            } finally {
            }
        } finally {
        }
    }

    public final p d(File file) {
        Map mapB;
        Map mapB2;
        Map mapB3;
        List list;
        RandomAccess randomAccess;
        BufferedReader bufferedReader;
        n nVarR;
        File file2 = new File(file, "tags.json");
        boolean zExists = file2.exists();
        kf.b bVar = this.f32534c;
        if (zExists) {
            try {
                JSONObject jSONObjectI = i(file2);
                v70.i iVar = new v70.i();
                Iterator<String> itKeys = jSONObjectI.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    String string = jSONObjectI.getString(next);
                    string.getClass();
                    iVar.put(next, string);
                }
                mapB = iVar.b();
            } catch (Exception e5) {
                bVar.a("DiagnosticsStorage: Failed to load tags: " + e5.getMessage());
                mapB = o0.f26530a;
                mapB.getClass();
            }
        } else {
            mapB = o0.f26530a;
            mapB.getClass();
        }
        Map map = mapB;
        File file3 = new File(file, "counters.json");
        if (file3.exists()) {
            try {
                JSONObject jSONObjectI2 = i(file3);
                v70.i iVar2 = new v70.i();
                Iterator<String> itKeys2 = jSONObjectI2.keys();
                itKeys2.getClass();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    next2.getClass();
                    iVar2.put(next2, Long.valueOf(jSONObjectI2.getLong(next2)));
                }
                mapB2 = iVar2.b();
            } catch (Exception e11) {
                bVar.a("DiagnosticsStorage: Failed to load counters: " + e11.getMessage());
                mapB2 = o0.f26530a;
                mapB2.getClass();
            }
        } else {
            mapB2 = o0.f26530a;
            mapB2.getClass();
        }
        Map map2 = mapB2;
        File file4 = new File(file, "histograms.json");
        if (file4.exists()) {
            try {
                JSONObject jSONObjectI3 = i(file4);
                v70.i iVar3 = new v70.i();
                Iterator<String> itKeys3 = jSONObjectI3.keys();
                itKeys3.getClass();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    next3.getClass();
                    JSONObject jSONObject = jSONObjectI3.getJSONObject(next3);
                    jSONObject.getClass();
                    iVar3.put(next3, new x(jSONObject.getLong("count"), jSONObject.getDouble("min"), jSONObject.getDouble("max"), jSONObject.getDouble("sum")));
                    jSONObjectI3 = jSONObjectI3;
                }
                mapB3 = iVar3.b();
            } catch (Exception e12) {
                bVar.a("DiagnosticsStorage: Failed to load histograms: " + e12.getMessage());
                mapB3 = o0.f26530a;
                mapB3.getClass();
            }
        } else {
            mapB3 = o0.f26530a;
            mapB3.getClass();
        }
        Map map3 = mapB3;
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles(new r());
            List<File> listN = fileArrListFiles != null ? kotlin.collections.y.N(new a60.r(21), fileArrListFiles) : n0.f26529a;
            if (listN.isEmpty()) {
                list = n0.f26529a;
            } else {
                ArrayList arrayList = new ArrayList();
                for (File file5 : listN) {
                    file5.getClass();
                    if (file5.exists()) {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            FileInputStream fileInputStream = new FileInputStream(file5);
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charsets.UTF_8));
                            } finally {
                            }
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    if (!StringsKt.H(line)) {
                                        try {
                                            nVarR = android.support.v4.media.session.a.r(new JSONObject(line));
                                        } catch (Exception unused) {
                                            nVarR = null;
                                        }
                                        if (nVarR != null) {
                                            try {
                                                arrayList2.add(nVarR);
                                            } catch (JSONException e13) {
                                                bVar.a("DiagnosticsStorage: Failed to parse event: " + e13.getMessage());
                                            }
                                        } else {
                                            bVar.a("DiagnosticsStorage: Skipping invalid event payload");
                                        }
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        u00.d.p(bufferedReader, th2);
                                        throw th3;
                                    }
                                }
                            }
                            bufferedReader.close();
                            fileInputStream.close();
                            randomAccess = arrayList2;
                        } catch (Exception e14) {
                            bVar.a("DiagnosticsStorage: Failed to load events: " + e14.getMessage());
                            randomAccess = n0.f26529a;
                        }
                    } else {
                        randomAccess = n0.f26529a;
                    }
                    arrayList.addAll(randomAccess);
                }
                list = arrayList;
            }
        } else {
            list = n0.f26529a;
        }
        if (map2.isEmpty() && map3.isEmpty() && list.isEmpty()) {
            return null;
        }
        return new p(map, map2, map3, list);
    }

    public final void e(Map map, File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        j(new File(file, "counters.json"), jSONObject);
    }

    public final void f(List list, File file) throws IOException {
        File file2 = new File(file, "events.log");
        if (!file2.exists()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file2.createNewFile();
        } else if (file2.length() >= 262144) {
            if (file2.renameTo(new File(file, l1.e("events-", System.currentTimeMillis(), ".log")))) {
                file2.createNewFile();
            } else {
                this.f32534c.d("DiagnosticsStorage: Failed to rotate events log");
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, Charsets.UTF_8));
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String string = ((n) it.next()).a().toString();
                    string.getClass();
                    bufferedWriter.write(string);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileOutputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public final void g(Map map, File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            x xVar = (x) entry.getValue();
            xVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("count", xVar.f32543a);
            jSONObject2.put("min", xVar.f32544b);
            jSONObject2.put("max", xVar.f32545c);
            jSONObject2.put("sum", xVar.f32546d);
            jSONObject.put(str, jSONObject2);
        }
        j(new File(file, "histograms.json"), jSONObject);
    }

    public final void h(Map map, File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        j(new File(file, "tags.json"), jSONObject);
    }

    public final void j(File file, JSONObject jSONObject) {
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, Charsets.UTF_8));
                    try {
                        bufferedWriter.write(jSONObject.toString());
                        bufferedWriter.close();
                        fileOutputStream.close();
                        if (!file2.renameTo(file)) {
                            e80.m.d(file2, file);
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e5) {
                this.f32534c.a("DiagnosticsStorage: Failed to write JSON to file: " + file.getAbsolutePath() + ": " + e5.getMessage());
                throw e5;
            }
        } finally {
            file2.delete();
        }
    }
}
