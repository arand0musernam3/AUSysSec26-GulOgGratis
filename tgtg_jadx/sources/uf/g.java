package uf;

import ax.p0;
import e80.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import lx.u;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final ConcurrentHashMap l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f41097m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f41098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f41100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kf.b f41101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ub.a f41102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f41104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f41105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f41106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e90.a f41107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e90.a f41108k;

    public g(File file, String str, p0 p0Var, kf.b bVar, ub.a aVar) throws Throwable {
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        file.getClass();
        str.getClass();
        bVar.getClass();
        aVar.getClass();
        this.f41098a = file;
        this.f41099b = str;
        this.f41100c = p0Var;
        this.f41101d = bVar;
        this.f41102e = aVar;
        this.f41103f = "amplitude.events.file.index.".concat(str);
        this.f41104g = "amplitude.events.file.version.".concat(str);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.f41105h = setNewSetFromMap;
        this.f41106i = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = l;
        Object objA = concurrentHashMap.get(str);
        if (objA == null && (objPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, (objA = e90.d.a()))) != null) {
            objA = objPutIfAbsent2;
        }
        this.f41107j = (e90.a) objA;
        ConcurrentHashMap concurrentHashMap2 = f41097m;
        Object objA2 = concurrentHashMap2.get(str);
        if (objA2 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (objA2 = e90.d.a()))) != null) {
            objA2 = objPutIfAbsent;
        }
        this.f41108k = (e90.a) objA2;
        f();
        f0.E(kotlin.coroutines.g.f26549a, new sf.a(this, null, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(uf.g r10, z70.c r11) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.g.a(uf.g, z70.c):java.lang.Object");
    }

    public final boolean b(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return true;
        } catch (IOException e5) {
            this.f41102e.j("Failed to create new storage file: " + e5.getMessage());
            this.f41101d.a("Failed to create new storage file: " + file.getPath());
            return false;
        }
    }

    public final File c() {
        ConcurrentHashMap concurrentHashMap = this.f41106i;
        String str = this.f41099b;
        File file = (File) concurrentHashMap.get(str);
        File file2 = this.f41098a;
        if (file == null) {
            File[] fileArrListFiles = file2.listFiles(new a(this, 1));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            file = (File) y.D(0, fileArrListFiles);
        }
        long jB = this.f41100c.b(this.f41103f, 0L);
        if (file == null) {
            file = new File(file2, str + '-' + jB + ".tmp");
        }
        concurrentHashMap.put(str, file);
        Object obj = concurrentHashMap.get(str);
        obj.getClass();
        return (File) obj;
    }

    public final void d(File file) {
        i(file);
        p0 p0Var = this.f41100c;
        String str = this.f41103f;
        p0Var.c(p0Var.b(str, 0L) + 1, str);
        this.f41106i.remove(this.f41099b);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:29:0x0086, B:30:0x0094, B:34:0x009e, B:36:0x00a2, B:38:0x00a8, B:43:0x00ba, B:42:0x00b7, B:44:0x00bd, B:46:0x00c3, B:48:0x00c9, B:49:0x00cf, B:50:0x00d2, B:52:0x00d8, B:53:0x00dc), top: B:64:0x0086, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r14, z70.c r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.g.e(java.lang.String, z70.c):java.lang.Object");
    }

    public final boolean f() {
        File file = this.f41098a;
        try {
            u.y(file);
            return true;
        } catch (IOException e5) {
            this.f41102e.j("Failed to create directory: " + e5.getMessage());
            this.f41101d.a("Failed to create directory for events storage: " + file.getPath());
            return false;
        }
    }

    public final String g(String str, String str2) {
        String str3 = "[" + StringsKt.g0(StringsKt.h0(str, '[', ','), ']', ',') + ']';
        try {
            String string = new JSONArray(str3).toString();
            string.getClass();
            return string;
        } catch (JSONException e5) {
            ub.a aVar = this.f41102e;
            if (((List) aVar.f40981b) == null) {
                aVar.f40981b = Collections.synchronizedList(new ArrayList());
            }
            List list = (List) aVar.f40981b;
            if (list != null) {
                list.add(str3);
            }
            StringBuilder sbT = e0.f.t("Failed to parse events: ", str3, ", dropping file: ", str2, ", error: ");
            sbT.append(e5);
            this.f41101d.a(sbT.toString());
            h(str2);
            return str3;
        }
    }

    public final boolean h(String str) {
        str.getClass();
        this.f41105h.remove(str);
        return new File(str).delete();
    }

    public final void i(File file) {
        if (!file.exists() || m.f(file).length() == 0) {
            return;
        }
        String strG = m.g(file);
        File file2 = this.f41098a;
        File file3 = new File(file2, strG);
        if (!file3.exists()) {
            file.renameTo(new File(file2, m.g(file)));
            return;
        }
        this.f41101d.b("File already exists: " + file3 + ", handle gracefully.");
        file.renameTo(new File(file2, strG + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(1000)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(z70.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof uf.d
            if (r0 == 0) goto L13
            r0 = r8
            uf.d r0 = (uf.d) r0
            int r1 = r0.f41090n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41090n = r1
            goto L18
        L13:
            uf.d r0 = new uf.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f41090n
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            e90.a r1 = r0.f41088k
            uf.g r0 = r0.f41087j
            ba0.g.M(r8)
            goto L49
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L32:
            ba0.g.M(r8)
            e90.a r8 = r7.f41107j
            r8.getClass()
            r0.f41087j = r7
            r0.f41088k = r8
            r0.f41090n = r3
            java.lang.Object r0 = r8.g(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r7
            r1 = r8
        L49:
            r8 = 0
            java.io.File r2 = r0.c()     // Catch: java.lang.Throwable -> L62
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L64
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L62
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L64
            r0.d(r2)     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r0 = move-exception
            goto L6a
        L64:
            kotlin.Unit r0 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L62
            r1.e(r8)
            return r0
        L6a:
            r1.e(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.g.j(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r9, z70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof uf.e
            if (r0 == 0) goto L13
            r0 = r10
            uf.e r0 = (uf.e) r0
            int r1 = r0.f41095o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41095o = r1
            goto L18
        L13:
            uf.e r0 = new uf.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f41093m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f41095o
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            e90.a r9 = r0.l
            java.lang.String r1 = r0.f41092k
            uf.g r0 = r0.f41091j
            ba0.g.M(r10)
            r10 = r9
            r9 = r1
            goto L4e
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L36:
            ba0.g.M(r10)
            e90.a r10 = r8.f41107j
            r10.getClass()
            r0.f41091j = r8
            r0.f41092k = r9
            r0.l = r10
            r0.f41095o = r3
            java.lang.Object r0 = r10.g(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r8
        L4e:
            r1 = 0
            boolean r2 = r0.f()     // Catch: java.lang.Throwable -> L79
            if (r2 != 0) goto L56
            goto L9f
        L56:
            java.io.File r2 = r0.c()     // Catch: java.lang.Throwable -> L79
            boolean r4 = r0.b(r2)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L9f
        L60:
            long r4 = r2.length()     // Catch: java.lang.Throwable -> L79
            r6 = 975000(0xee098, double:4.81714E-318)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7b
            r0.d(r2)     // Catch: java.lang.Throwable -> L79
            java.io.File r2 = r0.c()     // Catch: java.lang.Throwable -> L79
            boolean r4 = r0.b(r2)     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L60
            goto L9f
        L79:
            r9 = move-exception
            goto La5
        L7b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r4.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "\u0000"
            java.lang.String r6 = ""
            r7 = 0
            java.lang.String r9 = kotlin.text.y.n(r9, r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            r4.append(r9)     // Catch: java.lang.Throwable -> L79
            r4.append(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L79
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L79
            byte[] r9 = r9.getBytes(r4)     // Catch: java.lang.Throwable -> L79
            r9.getClass()     // Catch: java.lang.Throwable -> L79
            r0.n(r9, r2, r3)     // Catch: java.lang.Throwable -> L79
        L9f:
            kotlin.Unit r9 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L79
            r10.e(r1)
            return r9
        La5:
            r10.e(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.g.k(java.lang.String, z70.c):java.lang.Object");
    }

    public final void l(String str, JSONArray jSONArray) {
        try {
            jSONArray.put(new JSONObject(str));
        } catch (JSONException e5) {
            ub.a aVar = this.f41102e;
            if (((List) aVar.f40981b) == null) {
                aVar.f40981b = Collections.synchronizedList(new ArrayList());
            }
            List list = (List) aVar.f40981b;
            if (list != null) {
                list.add(str);
            }
            this.f41101d.a("Failed to parse event: " + str + ", error: " + e5);
        }
    }

    public final void m(List list, File file, boolean z11) {
        kf.b bVar = this.f41101d;
        ub.a aVar = this.f41102e;
        try {
            String strU = CollectionsKt.U(list, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, null, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, f.f41096a, 26);
            file.createNewFile();
            byte[] bytes = strU.getBytes(Charsets.UTF_8);
            bytes.getClass();
            n(bytes, file, z11);
            i(file);
        } catch (IOException e5) {
            aVar.j("Failed to create or write to split file: " + e5.getMessage());
            bVar.a("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e11) {
            aVar.j("Failed to write to split file: " + e11.getMessage());
            bVar.a("Failed to write to split file: " + file.getPath() + " for error: " + e11.getMessage());
        }
    }

    public final void n(byte[] bArr, File file, boolean z11) {
        kf.b bVar = this.f41101d;
        ub.a aVar = this.f41102e;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z11);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    u00.d.p(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (FileNotFoundException e5) {
            aVar.j("Error writing to file: " + e5.getMessage());
            bVar.a("File not found: " + file.getPath());
        } catch (IOException e11) {
            aVar.j("Error writing to file: " + e11.getMessage());
            bVar.a("Failed to write to file: " + file.getPath());
        } catch (SecurityException e12) {
            aVar.j("Error writing to file: " + e12.getMessage());
            bVar.a("Security exception when saving event: " + e12.getMessage());
        } catch (Exception e13) {
            aVar.j("Error writing to file: " + e13.getMessage());
            bVar.a("Failed to write to file: " + file.getPath());
        }
    }
}
