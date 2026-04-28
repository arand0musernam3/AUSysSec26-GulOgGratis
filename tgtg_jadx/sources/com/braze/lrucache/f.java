package com.braze.lrucache;

import com.braze.support.BrazeLogger;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f9911o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f9912p = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f9913q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f9914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f9915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f9916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f9917d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f9922i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9924k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9921h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f9923j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f9925m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f9926n = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9918e = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9920g = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9919f = 52428800;

    public f(File file) {
        this.f9914a = file;
        this.f9915b = new File(file, "journal");
        this.f9916c = new File(file, "journal.tmp");
        this.f9917d = new File(file, "journal.bkp");
    }

    public final synchronized void a(d dVar, boolean z11) {
        g gVar = dVar.f9906a;
        if (gVar.f9930d != dVar) {
            throw new IllegalStateException();
        }
        if (z11 && !gVar.f9929c) {
            for (int i11 = 0; i11 < this.f9920g; i11++) {
                if (!dVar.f9907b[i11]) {
                    dVar.f9909d.a(dVar, false);
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!gVar.a(i11).exists()) {
                    dVar.f9909d.a(dVar, false);
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < this.f9920g; i12++) {
            File fileA = gVar.a(i12);
            if (z11) {
                if (fileA.exists()) {
                    File file = new File(gVar.f9932f, gVar.f9927a + "." + i12);
                    fileA.renameTo(file);
                    long j9 = gVar.f9928b[i12];
                    long length = file.length();
                    gVar.f9928b[i12] = length;
                    this.f9921h = (this.f9921h - j9) + length;
                }
            } else if (fileA.exists() && !fileA.delete()) {
                throw new IOException();
            }
        }
        this.f9924k++;
        gVar.f9930d = null;
        if (gVar.f9929c || z11) {
            gVar.f9929c = true;
            BufferedWriter bufferedWriter = this.f9922i;
            StringBuilder sb2 = new StringBuilder("CLEAN ");
            sb2.append(gVar.f9927a);
            StringBuilder sb3 = new StringBuilder();
            for (long j11 : gVar.f9928b) {
                sb3.append(' ');
                sb3.append(j11);
            }
            sb2.append(sb3.toString());
            sb2.append('\n');
            bufferedWriter.write(sb2.toString());
            if (z11) {
                this.l++;
            }
        } else {
            this.f9923j.remove(gVar.f9927a);
            this.f9922i.write("REMOVE " + gVar.f9927a + '\n');
        }
        this.f9922i.flush();
        if (this.f9921h > this.f9919f || a()) {
            this.f9925m.submit(this.f9926n);
        }
    }

    public final synchronized e b(String str) {
        InputStream inputStream;
        if (this.f9922i == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f9911o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        g gVar = (g) this.f9923j.get(str);
        if (gVar == null) {
            return null;
        }
        if (!gVar.f9929c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f9920g];
        for (int i11 = 0; i11 < this.f9920g; i11++) {
            try {
                inputStreamArr[i11] = new FileInputStream(new File(gVar.f9932f, gVar.f9927a + "." + i11));
            } catch (FileNotFoundException unused) {
                for (int i12 = 0; i12 < this.f9920g && (inputStream = inputStreamArr[i12]) != null; i12++) {
                    Charset charset = j.f9939a;
                    try {
                        inputStream.close();
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused2) {
                    }
                }
                return null;
            }
        }
        this.f9924k++;
        this.f9922i.append((CharSequence) ("READ " + str + '\n'));
        if (a()) {
            this.f9925m.submit(this.f9926n);
        }
        return new e(inputStreamArr);
    }

    public final void c() {
        i iVar = new i(new FileInputStream(this.f9915b), j.f9939a);
        try {
            String strA = iVar.a();
            String strA2 = iVar.a();
            String strA3 = iVar.a();
            String strA4 = iVar.a();
            String strA5 = iVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f9918e).equals(strA3) || !Integer.toString(this.f9920g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    c(iVar.a());
                    i11++;
                } catch (EOFException unused) {
                    this.f9924k = i11 - this.f9923j.size();
                    if (iVar.f9938e == -1) {
                        d();
                    } else {
                        this.f9922i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9915b, true), j.f9939a));
                    }
                    try {
                        iVar.close();
                        return;
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                iVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.f9922i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9916c), j.f9939a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f9918e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f9920g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (g gVar : this.f9923j.values()) {
                    if (gVar.f9930d != null) {
                        bufferedWriter2.write("DIRTY " + gVar.f9927a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(gVar.f9927a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j9 : gVar.f9928b) {
                            sb3.append(' ');
                            sb3.append(j9);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f9915b.exists()) {
                    File file = this.f9915b;
                    File file2 = this.f9917d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f9916c.renameTo(this.f9915b)) {
                    throw new IOException();
                }
                this.f9917d.delete();
                this.f9922i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9915b, true), j.f9939a));
            } finally {
                try {
                    bufferedWriter2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void b() throws IOException {
        File file = this.f9916c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f9923j.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            int i11 = 0;
            if (gVar.f9930d == null) {
                while (i11 < this.f9920g) {
                    this.f9921h += gVar.f9928b[i11];
                    i11++;
                }
            } else {
                gVar.f9930d = null;
                while (i11 < this.f9920g) {
                    File file2 = new File(gVar.f9932f, gVar.f9927a + "." + i11);
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    File fileA = gVar.a(i11);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i11 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i11);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i11);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.f9923j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i11, iIndexOf2);
            }
            g gVar = (g) this.f9923j.get(strSubstring);
            if (gVar == null) {
                gVar = new g(strSubstring, this.f9920g, this.f9914a);
                this.f9923j.put(strSubstring, gVar);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                gVar.f9929c = true;
                gVar.f9930d = null;
                if (strArrSplit.length == gVar.f9931e) {
                    for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                        try {
                            gVar.f9928b[i12] = Long.parseLong(strArrSplit[i12]);
                        } catch (NumberFormatException unused) {
                            o.o(Arrays.toString(strArrSplit), "unexpected journal line: ");
                            return;
                        }
                    }
                    return;
                }
                o.o(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                gVar.f9930d = new d(this, gVar);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                i4.a.k("unexpected journal line: ".concat(str));
                return;
            }
        }
        i4.a.k("unexpected journal line: ".concat(str));
    }

    public final synchronized void d(String str) {
        try {
            if (this.f9922i != null) {
                if (f9911o.matcher(str).matches()) {
                    g gVar = (g) this.f9923j.get(str);
                    if (gVar != null && gVar.f9930d == null) {
                        for (int i11 = 0; i11 < this.f9920g; i11++) {
                            File file = new File(gVar.f9932f, gVar.f9927a + "." + i11);
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j9 = this.f9921h;
                            long[] jArr = gVar.f9928b;
                            this.f9921h = j9 - jArr[i11];
                            jArr[i11] = 0;
                        }
                        this.f9924k++;
                        this.f9922i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.f9923j.remove(str);
                        if (a()) {
                            this.f9925m.submit(this.f9926n);
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.f9922i != null) {
                    if (f9911o.matcher(str).matches()) {
                        g gVar = (g) this.f9923j.get(str);
                        if (gVar == null) {
                            gVar = new g(str, this.f9920g, this.f9914a);
                            this.f9923j.put(str, gVar);
                        } else if (gVar.f9930d != null) {
                            return null;
                        }
                        d dVar = new d(this, gVar);
                        gVar.f9930d = dVar;
                        this.f9922i.write("DIRTY " + str + '\n');
                        this.f9922i.flush();
                        return dVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a() {
        int i11 = this.f9924k;
        return i11 >= 2000 && i11 >= this.f9923j.size();
    }
}
