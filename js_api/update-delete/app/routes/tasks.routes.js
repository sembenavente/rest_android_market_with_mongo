import { Router } from "express";
import app from "../server";
const router = Router();

//Database connection
import { connect } from "../database";



router.get('/', async (req,res)=>{
    const db = await connect();
    const result = await db.collection('archivados').find({}).toArray();
    console.log(result);
    res.json(result);
});

router.post('/',async (req,res)=>{
    const db = await connect();
    console.log(req.body);
    var json2mongo = require('json2mongo');
    var query = req.body;
    const result = await db.collection('archivados').insertOne(json2mongo(query));
    res.json(result.ops[0]);
});



export default router;