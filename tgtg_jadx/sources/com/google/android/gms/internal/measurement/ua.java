package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s5 f11934a;

    static {
        Object qVar;
        ((i) d.f11331a).getClass();
        AtomicReference atomicReference = m.f11617f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            o oVar = (o) atomicReference.get();
            qVar = new q(strReplace, oVar.f11679a, oVar.f11680b, oVar.f11681c);
        } else {
            int i11 = 7;
            while (true) {
                if (i11 >= 0) {
                    char cCharAt = "Phlogger".charAt(i11);
                    if (cCharAt != '$') {
                        if (cCharAt == '.') {
                            break;
                        } else {
                            i11--;
                        }
                    } else {
                        strReplace = "Phlogger".replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            m mVar = new m(strReplace);
            if (m.f11614c || m.f11615d) {
                mVar.f11620b = new p(strReplace);
            } else if (m.f11616e) {
                o oVar2 = q.f11766h;
                mVar.f11620b = new q(strReplace, Level.OFF, oVar2.f11680b, oVar2.f11681c);
            } else {
                mVar.f11620b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = k.f11538a;
            concurrentLinkedQueue.offer(mVar);
            qVar = mVar;
            if (atomicReference.get() != null) {
                while (true) {
                    m mVar2 = (m) concurrentLinkedQueue.poll();
                    if (mVar2 == null) {
                        break;
                    }
                    o oVar3 = (o) atomicReference.get();
                    mVar2.f11620b = new q((String) mVar2.f11956a, oVar3.f11679a, oVar3.f11680b, oVar3.f11681c);
                }
                m.m();
                qVar = mVar;
            }
        }
        f11934a = new s5(qVar, 2);
    }
}
