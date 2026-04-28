package l8;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import com.google.firebase.messaging.a0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f27455j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile j f27456k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f27457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.f f27458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f27459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f27460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f27461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f27462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l50.a f27463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f27465i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f27457a = reentrantReadWriteLock;
        this.f27459c = 3;
        i iVar = (i) sVar.f27453b;
        this.f27462f = iVar;
        int i11 = sVar.f27452a;
        this.f27464h = i11;
        this.f27465i = (d) sVar.f27454c;
        this.f27460d = new Handler(Looper.getMainLooper());
        this.f27458b = new q1.f(0);
        this.f27463g = new l50.a(1);
        f fVar = new f(this);
        this.f27461e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i11 == 0) {
            try {
                this.f27459c = 0;
            } catch (Throwable th2) {
                this.f27457a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th3) {
                f(th3);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f27455j) {
            jVar = f27456k;
            pd.g.n("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", jVar != null);
        }
        return jVar;
    }

    public static boolean d() {
        return f27456k != null;
    }

    public final int b(int i11, CharSequence charSequence) {
        pd.g.n("Not initialized yet", c() == 1);
        pd.g.m(charSequence, "charSequence cannot be null");
        j30.g gVar = (j30.g) this.f27461e.f27449a;
        gVar.getClass();
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x[] xVarArr = (x[]) spanned.getSpans(i11, i11 + 1, x.class);
            if (xVarArr.length > 0) {
                return spanned.getSpanStart(xVarArr[0]);
            }
        }
        return ((q) gVar.u(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new q(i11))).f27473b;
    }

    public final int c() {
        this.f27457a.readLock().lock();
        try {
            return this.f27459c;
        } finally {
            this.f27457a.readLock().unlock();
        }
    }

    public final void e() {
        pd.g.n("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f27464h == 1);
        if (c() == 1) {
            return;
        }
        this.f27457a.writeLock().lock();
        try {
            if (this.f27459c == 0) {
                return;
            }
            this.f27459c = 0;
            this.f27457a.writeLock().unlock();
            f fVar = this.f27461e;
            j jVar = (j) fVar.f27451c;
            try {
                jVar.f27462f.a(new e(fVar));
            } catch (Throwable th2) {
                jVar.f(th2);
            }
        } finally {
            this.f27457a.writeLock().unlock();
        }
    }

    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f27457a.writeLock().lock();
        try {
            this.f27459c = 2;
            arrayList.addAll(this.f27458b);
            this.f27458b.clear();
            this.f27457a.writeLock().unlock();
            this.f27460d.post(new e7.a(arrayList, this.f27459c, th2));
        } catch (Throwable th3) {
            this.f27457a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009b A[Catch: all -> 0x008e, TRY_ENTER, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd A[Catch: all -> 0x0103, TRY_ENTER, TryCatch #0 {all -> 0x0103, blocks: (B:62:0x00cd, B:65:0x00d5, B:47:0x0091), top: B:90:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.j.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(h hVar) {
        pd.g.m(hVar, "initCallback cannot be null");
        this.f27457a.writeLock().lock();
        try {
            if (this.f27459c == 1 || this.f27459c == 2) {
                this.f27460d.post(new e7.a(Arrays.asList(hVar), this.f27459c, (Throwable) null));
            } else {
                this.f27458b.add(hVar);
            }
            this.f27457a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f27457a.writeLock().unlock();
            throw th2;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f27461e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        m8.b bVar = (m8.b) ((a0) fVar.f27450b).f12779b;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f21601d).getInt(iA + bVar.f21598a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
