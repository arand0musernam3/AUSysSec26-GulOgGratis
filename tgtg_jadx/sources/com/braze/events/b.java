package com.braze.events;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import us.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final HashSet a(ConcurrentHashMap concurrentHashMap, Class cls, ReentrantLock reentrantLock) {
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet(copyOnWriteArraySet);
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArraySet) {
                if (obj instanceof IFireOnceEventSubscriber) {
                    arrayList.add(obj);
                }
            }
            copyOnWriteArraySet.removeAll(CollectionsKt.v0(arrayList));
            concurrentHashMap.put(cls, copyOnWriteArraySet);
            return hashSet;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(Class cls, Set set) {
        return "Triggering " + cls.getName() + " on " + set.size() + " subscribers.";
    }

    public final Set a(Class cls, HashSet hashSet) {
        hashSet.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new j(9, cls, hashSet), 3, (Object) null);
        return hashSet;
    }
}
