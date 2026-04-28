package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class jf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jf f11525c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f11526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f11527b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f11525c = new jf(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public jf(UUID uuid, long j9) {
        this.f11526a = uuid;
        this.f11527b = new AtomicLong((j9 ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j9;
        long j11;
        long j12;
        do {
            atomicLong = this.f11527b;
            j9 = atomicLong.get();
            j11 = ((j9 * 25214903917L) + 11) & 281474976710655L;
            j12 = ((25214903917L * j11) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j9, j12));
        return (((long) ((int) (j11 >>> 16))) << 32) + ((long) ((int) (j12 >>> 16)));
    }

    public final UUID b() {
        long jA = a() & (-61441);
        long jA2 = a() >>> 2;
        UUID uuid = this.f11526a;
        return new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
    }
}
