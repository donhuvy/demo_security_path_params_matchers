package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreeController {

    /**
     * GET http://localhost:8888/foo
     *
     * @return
     */
    @GetMapping("/foo")
    public String foo() {
        return "At http://localhost:8888/foo/";
    }

    /**
     * GET http://localhost:8888/foo
     *
     * @param foo_id
     * @return
     */
    @GetMapping("/foo/{foo_id}")
    public String fooId(String foo_id) {
        return ("At http://localhost:8888/foo/" + foo_id);
    }

    /**
     * GET http://localhost:8888/foo/abc/xyz
     *
     * @param foo_id
     * @param id2
     * @return
     */
    @GetMapping("/foo/{foo_id}/{id2}")
    public String fooId(String foo_id, String id2) {
        return ("At http://localhost:8888/foo/" + foo_id + "/" + id2);
    }

    /**
     * GET http://localhost:8888/foo/abc/xyz/ack
     *
     * @param foo_id
     * @param id2
     * @return
     */
    @GetMapping("/foo/{foo_id}/{id2}/ack")
    public String fooIdAck(String foo_id, String id2) {
        return ("At http://localhost:8888/foo/" + foo_id + "/" + id2 + "/ack");
    }

    /**
     * GET http://localhost:8888/bar
     *
     * @return
     */
    @GetMapping("/bar")
    public String bar() {
        return "At http://localhost:8888/bar/";
    }

    /**
     * GET http://localhost:8888/bar/opqr
     *
     * @param bar_id
     * @return
     */
    @GetMapping("/bar/{bar_id}")
    public String barId(String bar_id) {
        return ("At http://localhost:8888/bar/" + bar_id);
    }

}
